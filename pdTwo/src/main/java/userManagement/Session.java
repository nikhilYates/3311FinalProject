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

    private final String email;

    private Session(String email) {
        this.email = email;
    }

    public static Session login(String email, String password) throws IOException {
        ;   // login logic using csv file
        FileInputStream file = new FileInputStream(new File("src/main/resources/csv/user.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);
        
        Sheet sheet = workbook.getSheetAt(0);
        
        for (Row row : sheet) {		// checks for email, and if password matches
            if (email.equalsIgnoreCase(row.getCell(EMAILCELL).getStringCellValue())) {	// based on current positioning
            	if (password.equalsIgnoreCase(row.getCell(PASSWORDCELL).getStringCellValue())) {
            		workbook.close();
            		return new Session(email);
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
        File file = new File("src/main/resources/csv/user.xlsx");
        FileInputStream fileInput = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileInput);
        
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
        	validationCell.setCellValue(true);
        }
        
        FileOutputStream out = new FileOutputStream(file);
        
        workbook.write(out);
        workbook.close();
        
        return true; // false if not valid
    }
}