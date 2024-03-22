package itemManagement;
import java.util.*;


public class ItemRepo {
	
	public static final List<PhysicalItem> allPhysicalItems = new ArrayList<>();

	
	public static void addItem(PhysicalItem item) {
		allPhysicalItems.add(item);
	}
	
	
	public static PhysicalItem getItemById(String itemid) {
		
		for(PhysicalItem item : allPhysicalItems) {
			
			if(item.getItemID().equals(itemid)) {
				
				System.out.println(item.getTitle());
				
				return item;
			}
		}
		
		return null;
		
	}
	
	
	public static void printList(List<PhysicalItem> allPhysicalItems) {
		for(PhysicalItem item : allPhysicalItems) {
			System.out.println("Title: " + item.getTitle());
		}
	}
	
	   public static void searchItem(String match) {
	        List<PhysicalItem> matches = new ArrayList<>();
	        for (PhysicalItem item : allPhysicalItems) {
	            if (item.getTitle().toLowerCase().contains(match.toLowerCase())) {
	            	matches.add(item);
	            }
	        }
	        if (!matches.isEmpty()) {
	            
	            System.out.println("Below are all matching search results:\nTotal: "+ matches.size());
	            printList(matches);
	        } 
	        else {
	        	System.out.println("No matches found from your search results.");
	        }
	    }
	

}
