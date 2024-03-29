package userManagement;

import java.io.File;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import itemManagement.ItemRepo;
import itemManagement.PhysicalItem;

public abstract class User {
	
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
	
	protected String department;
	protected String major;
	protected int year;
	
	
	private List<RentalTransaction> rentalList = new ArrayList<>();
	
	/**
	 * Protected paramaterized constructor
	 * @param userID
	 * @param email
	 * @param password
	 */
	protected User(int userID, String email, int rowNum) {
		this.userID = userID;
		this.email = email;
		this.rowNum = rowNum;
		this.usertype = this.getClass().getSimpleName();
	}

	
	public List<RentalTransaction> getRentalList() {
		
		UserManager userOps = new CommonUserOperations();
		
		
		System.out.println("\nRental List for " + this.email + ": ");
		System.out.println("---------------------------------------------------");
		
		if(this.rentalList.size() < 1) {
			
			System.out.println("You have not rented anything yet. You can rent up to 10 items from the library.");
		}
		
		else {
			for(RentalTransaction rentedItem : this.rentalList) {
				
				
				PhysicalItem itemOfInterest = ItemRepo.getItemById(rentedItem.getItemid());
				
				
				System.out.println("Item ID: " + rentedItem.getItemid());
				System.out.println("Title: " + itemOfInterest.getTitle());
				System.out.println("Rented on: " + rentedItem.getRentalDate().toString());
				System.out.println("Due by: " + rentedItem.getDueDate().toString());
				
				if(userOps.rentalDueSoonPrompt(rentedItem)) {
					System.out.println("RENTAL DUE IN THE NEXT 24 HOURS.");
				}
				
				if(rentedItem.getLatePenalty() > 0) {
					System.out.println("LATE ITEM - PENALTY OF $" + rentedItem.getLatePenalty() + " applied to your account.");
				}
				
				System.out.println("---------------------------------------------------");
			
				
			}
		}
		
		return this.rentalList;
	}
	
	public void addToRentalList(RentalTransaction rental) {
		
		UserManager userOps = new CommonUserOperations();
		
		if(userOps.checkRentalAbility(rentalList)) {
			
			rentalList.add(rental);
			System.out.println("Client Side - Item added to rental list");
			System.out.println("Updated List: ");
			
			for(RentalTransaction rentedItem : rentalList) {
				
				System.out.println(rentedItem.getItemid());
				
			}
		}
		
	}
	
	/**
	 * To showcase all the functionality of the CommonOperations class
	 */
	public void comprehensiveReport() {
		
		UserManager userOps = new CommonUserOperations();
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("COMPREHENSIVE USER REPORT FOR " + this.email + '\n');
		
		System.out.println("User ID: " + this.userID);
		System.out.println("User Category: " + this.usertype);
		this.getRentalList();
		
		System.out.println("All HardCover Rentals: ");
		List<RentalTransaction> hardcoverRentals = userOps.getCurrentHardcoverRentals(this.rentalList);
		
		for(RentalTransaction hardcoverRental : hardcoverRentals) {
			
			System.out.println("Hardcover item id: " + hardcoverRental.getItemid());
		}
		
		
		List<RentalTransaction> lateItems = userOps.countOverdueItems(this.rentalList);
		
		if(lateItems.size() >= 3) {
			
			System.out.println("ALERT. Your account's ability to rent items has been suspended due to at least 3 late items. Please return these items to regain rent ability.");
		}
		
		
		double totalLateBalance = userOps.calculateLateFees(rentalList);
		
		if(totalLateBalance > 0) {
			
			System.out.println("ALERT. You have an outstanding balance of $" + totalLateBalance + ". Pay the balance immediately.");
			
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		
	}
	
	
	
	/**
	 * Getter methods down here
	 * @return
	 */

	public int getUserID() {
		return userID;
	}

	/**
	 * 
	 * @return get the user email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * 
	 * @return get the usertype
	 */
	public String getUsertype() {
		return usertype;
	}
	
	// to be used by only faculty, null for others
	public String getDepartment() {
		return department;
	}
	
	// to be used by only student, null for others
	public String getMajor() {
		return major;
	}
	
	// to be used by only student, null for others
	public int getYear() {
		return year;
	}
	
	// to be overridden
	public void setDepartment(String department) throws IOException {}
	
	// to be overridden
	public void setMajor(String major) throws IOException {}
	
	// to be overridden
	public void setYear(int year) throws IOException {}
	
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
            		boolean validated = row.getCell(VALIDATIONCELL).getBooleanCellValue();
            		if (!validated) {
            			break;
            		}
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
        
        if (userType.getSimpleName().equalsIgnoreCase(Visitor.class.getSimpleName())) {
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
    
    // temporary
    public static void verifyUser(String email) throws IOException {
    	Workbook workbook = getWorkbook();
        
        Sheet sheet = workbook.getSheetAt(0);
        
        for (Row row : sheet) {
            if (email.equalsIgnoreCase(row.getCell(EMAILCELL).getStringCellValue())) {
            	row.getCell(VALIDATIONCELL).setCellValue(true);
            	
            	FileOutputStream out = new FileOutputStream(file);
            	
            	workbook.write(out);
            	workbook.close();
            }
        }
    }

	
}
