package itemManagement;

public class PhysicalItem extends PhysicalItemState {
    private int availableCopies;
    private PhysicalItemState state;

    public PhysicalItem() {
        state = new OpenState(); // by default all items are available for rent
        availableCopies = 20;
    }
    
    public void setState(PhysicalItemState state) {
    	this.state = state;
    }

    @Override
    public boolean displayState() {
        if (availableCopies>0) {
        	System.out.println("PI, TRUE");
        	this.state = new OpenState();
        	return true;

        }
        else {
        	System.out.println("PI, FALSE");
        	this.state = new ClosedState();
        	return false;
        }
    }

	@Override
	public void rentOut(PhysicalItem item) {
		state.rentOut(this);
		if (state.displayState()==true) {
			availableCopies = availableCopies -5 ; // USED TO TEST, DECREMENT BY 1 FOR FINAL PROJ.
		}
		if (availableCopies <= 0) {
			this.state = new ClosedState();
			availableCopies = 0; // USED TO TEST, VERY LIKELY WE WON'T NEED THIS FOR FINAL.
		}
	}

	@Override
	public void returnItem(PhysicalItem item) {
		availableCopies++;
		state.returnItem(this);
		
	}
	
    public void printStatus() { // TEST METHOD
        System.out.println("Number of copies: " + availableCopies);
    }
}
