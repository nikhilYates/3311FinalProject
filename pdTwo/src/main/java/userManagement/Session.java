package userManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Session {
	
	private static final int EMAILCELL = 2;
	private static final int PASSWORDCELL = 3;
	private static final int USERTYPECELL = 4;
	private static final int VALIDATIONCELL = 5;
	
	private static final File file = new File("src/main/resources/csv/user.xlsx");

    private final String email;
    private final int rowNum;

    private Session(String email, int rowNum) {
        this.email = email;
        this.rowNum = rowNum;
    }
    
    private static Workbook getWorkbook() throws IOException {
    	FileInputStream fileInput = new FileInputStream(file);
        
        return new XSSFWorkbook(fileInput);
    }

    public static Session login(String email, String password) throws IOException {
        ;   // login logic using csv file
        Workbook workbook = getWorkbook();
        
        Sheet sheet = workbook.getSheetAt(0);
        
        for (Row row : sheet) {		// checks for email, and if password matches
            if (email.equalsIgnoreCase(row.getCell(EMAILCELL).getStringCellValue())) {	// based on current positioning
            	if (password.equalsIgnoreCase(row.getCell(PASSWORDCELL).getStringCellValue())) {
            		int thisRowNum = row.getRowNum();
            		workbook.close();
            		return new Session(email, thisRowNum);
            	} else {
            		break;
            	}
            }
        }
        
        workbook.close();
        
        return null;
    }

    public static boolean signup(String email, String password, User userType) throws IOException {
        ;   // sign up logic using csv file and doing some basic validation, maybe
        Workbook workbook = getWorkbook();
        
        Sheet sheet = workbook.getSheetAt(0);
        
        for (Row row : sheet) {		// checks if email already exists; also doesn't work
            if (email.equalsIgnoreCase(row.getCell(EMAILCELL).getStringCellValue())) {	// based on current positioning
            	workbook.close();
            	return false;
            }
        }
        
        int rowNum = sheet.getLastRowNum() + 1;
        Row newRow = sheet.createRow(rowNum);
        
        Cell emailCell = newRow.createCell(EMAILCELL);
        Cell passwordCell = newRow.createCell(PASSWORDCELL);
        Cell userTypeCell = newRow.createCell(USERTYPECELL);
        Cell validationCell = newRow.createCell(VALIDATIONCELL);
        
        emailCell.setCellValue(email);
        passwordCell.setCellValue(password);
        userTypeCell.setCellValue(userType.getClass().getSimpleName());
        
        if (userType.getClass().getSimpleName() == Visitor.class.getSimpleName()) {
        	validationCell.setCellValue(true);
        } else {
        	validationCell.setCellValue(false);
        }
        
        FileOutputStream out = new FileOutputStream(file);
        
        workbook.write(out);
        workbook.close();
        
        return true; // false if not valid
    }
    
    // add a row delete method, wither static and find email and delete, or via class and change constructor to initiate with row instead of email
    // or do both, one can be for testing and one for client, testing will be the static
    public boolean deleteUser() throws IOException {	// you need to be logged in and use that session object
    	Workbook workbook = getWorkbook();
        
        Sheet sheet = workbook.getSheetAt(0);
        
        Row theRow = sheet.getRow(this.rowNum);
        if (theRow != null) {
        	sheet.removeRow(sheet.getRow(this.rowNum));
        	
        	FileOutputStream out = new FileOutputStream(file);
        	
        	workbook.write(out);
        	workbook.close();
        	return true;
        }
        
        workbook.close();
        return false;
    }
}