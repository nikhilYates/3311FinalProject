package itemManagement;

public abstract class DigitalItemDecorator implements DigitalItem {
	protected DigitalItem decoratedDigitalItem;

	public DigitalItemDecorator(DigitalItem decoratedDigitalItem) {
		this.decoratedDigitalItem = decoratedDigitalItem;
	}

}
