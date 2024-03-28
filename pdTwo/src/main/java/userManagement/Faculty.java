package userManagement;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Faculty extends User {

	/**
	 * Faculty Constructor
	 * 
	 * @param userID
	 * @param email
	 * @param password
	 * @param usertype
	 * @param department
	 */
	protected Faculty(int userID, String email, int rowNum, String department) {

		super(userID, email, rowNum);
		this.department = department;
	}

	// to set the department, at the Beginning it's empty
	@Override
	public void setDepartment(String department) throws IOException {
		Workbook workbook = getWorkbook();

		Sheet sheet = workbook.getSheetAt(0);

		Row accountRow = sheet.getRow(this.rowNum);
		Cell departmentCell = accountRow.createCell(DEPARTMENTCELL);
		departmentCell.setCellValue(department);

		FileOutputStream out = new FileOutputStream(file);

		workbook.write(out);
		workbook.close();
	}

}
