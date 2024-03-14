package itemManagement;


public abstract class PhysicalItemState implements Product {

	public boolean displayState() {
		return true;
	}
	
	public void rentOut(PhysicalItem item) {
		
	}

	public void returnItem(PhysicalItem item) {
	}

}
