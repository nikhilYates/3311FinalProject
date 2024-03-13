package itemManagement;


public abstract class PhysicalItemState extends Product {

	public boolean displayState() {
		return true;
	}
	
	public void rentOut(PhysicalItem item) {
		
	}

	public void returnItem(PhysicalItem item) {
	}

}
