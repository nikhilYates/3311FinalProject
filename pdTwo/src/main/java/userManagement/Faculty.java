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
	public Faculty(int userID, String email, int rowNum, String department) {

		super(userID, email, rowNum);
		this.department = department;
	}

	// to set the department, at the Beginning it's empty
	@Override
	public void setDepartment(String department) throws IOException {
	    if (department == null) {
	        throw new IllegalArgumentException("Department cannot be null");
	    }
	    this.department = department; // Update the department in memory

	    // If you're using an Excel file to store data persistently
	    Workbook workbook = getWorkbook(); // Method to get the Excel workbook
	    Sheet sheet = workbook.getSheetAt(0);
	    Row row = sheet.getRow(this.rowNum); // `rowNum` should correspond to this faculty's row in the Excel file
	    if (row != null) {
	        Cell departmentCell = row.createCell(DEPARTMENTCELL); // DEPARTMENTCELL is the index of the department column
	        departmentCell.setCellValue(department);
	        try (FileOutputStream outputStream = new FileOutputStream(User.file)) { // User.file should be the path to the Excel file
	            workbook.write(outputStream);
	        }
	    }
	    workbook.close(); // Make sure to close the workbook to avoid resource leaks
	}


}
