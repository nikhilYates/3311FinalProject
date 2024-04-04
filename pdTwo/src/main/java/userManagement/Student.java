package userManagement;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Student extends User {

	/**
	 * Student constructor
	 * 
	 * @param userID
	 * @param email
	 * @param password
	 * @param usertype
	 * @param major
	 * @param year
	 */
	public Student(int userID, String email, int rowNum, String major, int year) {

		super(userID, email, rowNum);
		this.major = major;
		this.year = year;
	}

	// to set the major, at the Beginning it's empty
	@Override
	public void setMajor(String major) throws IOException {
	    // Check if the provided major is null and throw an IllegalArgumentException if it is
	    if (major == null) {
	        throw new IllegalArgumentException("Major cannot be null");
	    }

	    this.major = major; // Update the major in memory

	    // Proceed with the existing logic only if we're not in a testing environment
	    if (!isInTestingEnvironment()) {
	        Workbook workbook = getWorkbook(); // Method to get the Excel workbook
	        Sheet sheet = workbook.getSheetAt(0);
	        Row row = sheet.getRow(this.rowNum); // `rowNum` should correspond to this student's row in the Excel file
	        if (row != null) {
	            Cell majorCell = row.createCell(MAJORCELL); // MAJORCELL is the index of the major column
	            majorCell.setCellValue(major);
	            try (FileOutputStream outputStream = new FileOutputStream(User.file)) { // User.file should be the path to the Excel file
	                workbook.write(outputStream);
	            }
	        }
	        workbook.close(); // Make sure to close the workbook to avoid resource leaks
	    }
	}

	// to set the year, at the Beginning it's empty
	@Override
	public void setYear(int year) throws IOException {
		// Update the class attribute
		this.year = year;

		// Only interact with the Excel file if not in a testing environment
		if (!isInTestingEnvironment()) {
			Workbook workbook = getWorkbook();
			Sheet sheet = workbook.getSheetAt(0);
			Row accountRow = sheet.getRow(this.rowNum);

			if (accountRow != null) {
				Cell yearCell = accountRow.createCell(YEARCELL);
				yearCell.setCellValue(year);

				try (FileOutputStream out = new FileOutputStream(file)) {
					workbook.write(out);
				}
			}

			workbook.close();
		}
	}

	private boolean isInTestingEnvironment() {
		return Boolean.parseBoolean(System.getProperty("isTesting"));
	}

}