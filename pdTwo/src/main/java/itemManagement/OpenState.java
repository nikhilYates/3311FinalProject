package itemManagement;

class OpenState extends PhysicalItemState {
	@Override
	public boolean displayState() {
		System.out.println("STATE: TRUE PIS.");
		return true;
	}

	@Override
	public void rentOut(PhysicalItem item) {
		System.out.println("YOU HAVE RENTED THIS ITEM. THANKS!");

	}

	@Override
	public void returnItem(PhysicalItem item) {
		System.out.println("YOU HAVE RETURNED THE ITEM. THANK YOU! (open)");
	}

}
