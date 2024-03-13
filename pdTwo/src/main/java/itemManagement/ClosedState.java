package itemManagement;

class ClosedState extends PhysicalItemState {
	 @Override
	 public boolean displayState() {
	     System.out.println("STATE : FALSE PIS.");
	     return false;
	 }
	 @Override
	public void rentOut(PhysicalItem item) {
	    System.out.println("Item is UNAVAILABLE to be rented. PIS");
		
	}
	 @Override
	public void returnItem(PhysicalItem item) {
	    System.out.println("YOU HAVE RETURNED THE ITEM. THANK YOU!");
		
	}
	}