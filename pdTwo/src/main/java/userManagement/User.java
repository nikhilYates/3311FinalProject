package userManagement;

<<<<<<< Updated upstream
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class User implements UserManager {
	
	protected static final int USERIDCELL = 1;
	protected static final int EMAILCELL = 2;
	protected static final int PASSWORDCELL = 3;
	protected static final int USERTYPECELL = 4;
	protected static final int VALIDATIONCELL = 5;
	protected static final int DEPARTMENTCELL = 6;
	protected static final int MAJORCELL = 7;
	protected static final int YEARCELL = 8;
	
	protected static final File file = new File("src/main/resources/csv/user.xlsx");
	
	protected final int rowNum;
	
	private int userID;
	private String email;
	private String usertype;
	
	/**
	 * Protected paramaterized constructor
=======
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class User implements UserManager {

	enum UserType {
		STUDENT, FACULTY, STAFF, VISITOR
	}

	private String userID;
	private String email;
	private String password;
	private UserType userType;

	/**
	 * Private paramaterized constructor
	 * 
>>>>>>> Stashed changes
	 * @param userID
	 * @param email
	 * @param password
	 */
<<<<<<< Updated upstream
	protected User(int userID, String email, int rowNum) {
		this.userID = userID;
		this.email = email;
		this.rowNum = rowNum;
		this.usertype = this.getClass().getSimpleName();
=======
	public User(String userID, String email, String password, UserType userType) {
		if (!validateEmail(email)) {
			throw new IllegalArgumentException("Invalid email address.");
		}
		if (!validatePassword(password)) {
			throw new IllegalArgumentException("Password does not meet complexity requirements.");
		}
		this.userID = userID;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}

	/**
	 * Public User constructor
	 */
	public User() {

		System.out.println("User Default Constructor");
>>>>>>> Stashed changes
	}

	public abstract void register(String email, String password, UserType userType);

	public boolean login(String email, String password) {
		// This method should check against stored user credentials, typically in a
		// database.
		// The below code assumes a check against the current attributes for simplicity.
		return this.email.equals(email) && this.password.equals(password);
	}

	protected boolean validateEmail(String email) {
		// Regex for validating email
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	protected boolean validatePassword(String password) {
		// Regex for validating password complexity: At least one digit, one lowercase,
		// one uppercase, one special character, and at least 8 characters
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public void notifyValidation() {
		System.out.println("User " + email + " has been validated.");
	}

<<<<<<< Updated upstream
	public int getUserID() {
		return userID;
=======
	public String getUserID() {
		return this.userID;
>>>>>>> Stashed changes
	}

	public String getEmail() {
		return this.email;
	}

<<<<<<< Updated upstream

	/**
	 * 
	 * @return get the usertype
	 */
	public String getUsertype() {
		return usertype;
=======
	public String getPassword() {
		return this.password;
	}

	public UserType getUsertype() {
		return this.userType;
>>>>>>> Stashed changes
	}
	
	// subclasses might want access this for additional attributes
	protected static Workbook getWorkbook() throws IOException {
    	FileInputStream fileInput = new FileInputStream(file);
        
        return new XSSFWorkbook(fileInput);
    }
	
	public static User login(String email, String password) throws IOException {
        ;   // login logic using csv file
        Workbook workbook = getWorkbook();
        
        Sheet sheet = workbook.getSheetAt(0);
        
        for (Row row : sheet) {		// checks for email, and if password matches
            if (email.equalsIgnoreCase(row.getCell(EMAILCELL).getStringCellValue())) {	// based on current positioning
            	if (password.equalsIgnoreCase(row.getCell(PASSWORDCELL).getStringCellValue())) {
            		int thisRowNum = row.getRowNum();
            		String userType = row.getCell(USERTYPECELL).getStringCellValue();
            		workbook.close();
            		if (userType.equalsIgnoreCase(Faculty.class.getSimpleName())) {
            			return new Faculty((int) row.getCell(USERIDCELL).getNumericCellValue(), email, thisRowNum, row.getCell(DEPARTMENTCELL).getStringCellValue());
            		} else if (userType.equalsIgnoreCase(NonFaculty.class.getSimpleName())) {
            			return new NonFaculty((int) row.getCell(USERIDCELL).getNumericCellValue(), email, thisRowNum);
            		} else if (userType.equalsIgnoreCase(Student.class.getSimpleName())) {
            			return new Student((int) row.getCell(USERIDCELL).getNumericCellValue(), email, thisRowNum, row.getCell(MAJORCELL).getStringCellValue(), (int) row.getCell(YEARCELL).getNumericCellValue());
            		} else if (userType.equalsIgnoreCase(Visitor.class.getSimpleName())) {
            			return new Visitor((int) row.getCell(USERIDCELL).getNumericCellValue(), email, thisRowNum);
            		}
            	} else {
            		break;
            	}
            }
        }
        
        workbook.close();
        
        return null;
    }

    public static boolean signup(int userId, String email, String password, Class<? extends User> userType) throws IOException {
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
        
        Cell userIdCell = newRow.createCell(USERIDCELL);
        Cell emailCell = newRow.createCell(EMAILCELL);
        Cell passwordCell = newRow.createCell(PASSWORDCELL);
        Cell userTypeCell = newRow.createCell(USERTYPECELL);
        Cell validationCell = newRow.createCell(VALIDATIONCELL);
        Cell departmentCell = newRow.createCell(DEPARTMENTCELL);
        Cell majorCell = newRow.createCell(MAJORCELL);
        Cell yearCell = newRow.createCell(YEARCELL);
        
        userIdCell.setCellValue(userId);
        emailCell.setCellValue(email);
        passwordCell.setCellValue(password);
        userTypeCell.setCellValue(userType.getSimpleName());
        departmentCell.setCellValue("");
        majorCell.setCellValue("");
        yearCell.setCellValue(0);
        
        if (userType.getSimpleName() == Visitor.class.getSimpleName()) {
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

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setEmail(String email) {
		if (!validateEmail(email)) {
			throw new IllegalArgumentException("Invalid email address.");
		}
		this.email = email;
	}

	public void setPassword(String password) {
		if (!validatePassword(password)) {
			throw new IllegalArgumentException("Password does not meet complexity requirements.");
		}
		this.password = password;
	}
	
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

}
