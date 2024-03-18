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
	 * @param userID
	 * @param email
	 * @param password
	 * @param usertype
	 * @param major
	 * @param year
	 */
	protected Student(int userID, String email, int rowNum, String major, int year) {
		
		super(userID, email, rowNum);
		this.major = major;
		this.year = year;
	}
	
	// to set the major, at the Beginning it's empty
	@Override
	public void setMajor(String major) throws IOException {
		Workbook workbook = getWorkbook();
        
        Sheet sheet = workbook.getSheetAt(0);
        
        Row accountRow = sheet.getRow(this.rowNum);
        Cell majorCell = accountRow.createCell(MAJORCELL);
        majorCell.setCellValue(major);
        
        FileOutputStream out = new FileOutputStream(file);
        
        workbook.write(out);
        workbook.close();
        
        this.major = major;
	}
	
	// to set the year, at the Beginning it's empty
	@Override
	public void setYear(int year) throws IOException {
		Workbook workbook = getWorkbook();
        
        Sheet sheet = workbook.getSheetAt(0);
        
        Row accountRow = sheet.getRow(this.rowNum);
        Cell yearCell = accountRow.createCell(YEARCELL);
        yearCell.setCellValue(year);
        
        FileOutputStream out = new FileOutputStream(file);
        
        workbook.write(out);
        workbook.close();
        
        this.year = year;
	}

}