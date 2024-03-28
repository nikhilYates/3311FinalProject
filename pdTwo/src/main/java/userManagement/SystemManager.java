package userManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import itemManagement.BookRequestManagement;
import itemManagement.PhysicalItem;
import itemManagement.BookRequest;

public class SystemManager {

	// for user file
	private static final int EMAILCELL = 2;
	private static final int VALIDATIONCELL = 5;

	// for item file
	private static final int ITEMIDCELL = 0;
	private static final int TITLECELL = 1;
	private static final int RENTSTATUSCELL = 9;

	private static final File file = new File("src/main/resources/csv/user.xlsx");
	private static final File fileItem = new File("src/main/resources/csv/item.xlsx");

	private static SystemManager instance;

	private static final long actualCode = 1162070547; // Means EECS from EECS -> bits -> decimal

	private SystemManager() {
	} // private constructor for singleton

	public static SystemManager getSystemManager(long code) {
		if (code == actualCode) {
			if (instance == null) { // lazy initialization of singleton
				instance = new SystemManager();
			}
			return instance;
		}
		return null;
	}

	private Workbook getWorkbook() throws IOException {
		FileInputStream fileInput = new FileInputStream(file);

		return new XSSFWorkbook(fileInput);
	}

	private Workbook getWorkbookItem() throws IOException {
		FileInputStream fileInput = new FileInputStream(fileItem);

		return new XSSFWorkbook(fileInput);
	}

	public boolean verifyUser(String email) throws IOException {
		Workbook workbook = getWorkbook();

		Sheet sheet = workbook.getSheetAt(0);

		for (Row row : sheet) {
			if (email.equalsIgnoreCase(row.getCell(EMAILCELL).getStringCellValue())) {
				row.getCell(VALIDATIONCELL).setCellValue(true);

				FileOutputStream out = new FileOutputStream(file);

				workbook.write(out);
				workbook.close();

				return true;
			}
		}

		workbook.close();

		return false;
	}

	// method to enable an item
	public boolean enableItem(int itemId) throws IOException {
		Workbook workbook = getWorkbookItem();

		Sheet sheet = workbook.getSheetAt(0);

		for (Row row : sheet) {
			if (!row.getCell(ITEMIDCELL).getCellType().equals(CellType.NUMERIC)) {
				continue;
			}
			if (itemId == (int) row.getCell(ITEMIDCELL).getNumericCellValue()) {
				Cell cell = row.getCell(RENTSTATUSCELL);
				if (cell == null) {
					cell = row.createCell(RENTSTATUSCELL);
				}
				cell.setCellValue(true);

				FileOutputStream out = new FileOutputStream(fileItem);

				workbook.write(out);
				workbook.close();

				return true;
			}
		}

		workbook.close();

		return false;
	}

	// method to disable an item
	public boolean disableItem(int itemId) throws IOException {
		Workbook workbook = getWorkbookItem();

		Sheet sheet = workbook.getSheetAt(0);

		for (Row row : sheet) {
			if (!row.getCell(ITEMIDCELL).getCellType().equals(CellType.NUMERIC)) {
				continue;
			}
			if (itemId == (int) row.getCell(ITEMIDCELL).getNumericCellValue()) {
				Cell cell = row.getCell(RENTSTATUSCELL);
				if (cell == null) {
					cell = row.createCell(RENTSTATUSCELL);
				}
				cell.setCellValue(false);

				FileOutputStream out = new FileOutputStream(fileItem);

				workbook.write(out);
				workbook.close();

				return true;
			}
		}

		workbook.close();

		return false;
	}

	// method to add an item
	public boolean addItem(PhysicalItem item) throws IOException {
		Workbook workbook = getWorkbookItem();

		Sheet sheet = workbook.getSheetAt(0);

		for (Row row : sheet) {
			if (!row.getCell(ITEMIDCELL).getCellType().equals(CellType.NUMERIC)) {
				continue;
			}
			if ((int) row.getCell(ITEMIDCELL).getNumericCellValue() == Integer.parseInt(item.getItemID())) {
				workbook.close();
				return false;
			}
		}

		Row newRow = sheet.createRow(sheet.getLastRowNum() + 1);

		Cell itemId = newRow.createCell(ITEMIDCELL);
		Cell title = newRow.createCell(TITLECELL);

		itemId.setCellValue(Integer.parseInt(item.getItemID()));
		title.setCellValue(item.getTitle());

		FileOutputStream out = new FileOutputStream(fileItem);

		workbook.write(out);
		workbook.close();

		return true;
	}

	public boolean deleteItem(PhysicalItem item) throws IOException {
		Workbook workbook = getWorkbookItem();

		Sheet sheet = workbook.getSheetAt(0);

		Row row;
		Cell cell;
		for (int i = sheet.getLastRowNum(); i >= 0; i--) {
			row = sheet.getRow(i);
			if (row != null) {
				cell = row.getCell(ITEMIDCELL);
				if (cell != null && cell.getCellType() == CellType.NUMERIC
						&& cell.getNumericCellValue() == Integer.parseInt(item.getItemID())) {
					sheet.removeRow(row);
				} else if (cell != null && cell.getCellType() == CellType.STRING
						&& cell.getStringCellValue().equalsIgnoreCase(item.getItemID())) {
					sheet.removeRow(row); // in case its a string cell, not a numeric one
				}
			}
		}

		FileOutputStream out = new FileOutputStream(fileItem);

		workbook.write(out);
		workbook.close();

		return true;
	}

	// method to see all requests
	public boolean printRequests(BookRequestManagement bookRequests) {
		List<BookRequest> requests = bookRequests.getRequestsSystemManagerOnly(this);
		if (requests != null) {
			for (BookRequest request : requests) {
				if (request.isSubmitted()) {
					System.out.println("\nRequest ID: " + request.getRequestID() + "\nRequest Type: "
							+ request.getRequestType() + "\nTopics: " + request.getTopics().toString());
				}
			}
			return true;
		}
		return false;
	}

	// Public static method to get the instance
	public static SystemManager getInstance() {
		if (instance == null) {
			instance = new SystemManager();
		}
		return instance;
	}
}
