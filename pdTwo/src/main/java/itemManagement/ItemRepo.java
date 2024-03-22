package itemManagement;
import java.util.*;


public class ItemRepo {
	
	private static final List<PhysicalItem> allPhysicalItems = new ArrayList<>();
	
	
	public static void addItem(PhysicalItem item) {
		
		
		allPhysicalItems.add(item);
	}
	
	
	public static PhysicalItem getItemById(String itemid) {
		
		for(PhysicalItem item : allPhysicalItems) {
			
			if(item.getTitle().equals(itemid)) {
				
				return item;
			}
		}
		
		return null;
		
	}
	

}
