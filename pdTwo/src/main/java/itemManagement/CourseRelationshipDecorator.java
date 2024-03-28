package itemManagement;

public class CourseRelationshipDecorator extends DigitalItemDecorator {
	private String course;

	public CourseRelationshipDecorator(DigitalItem decoratedDigitalItem) {
		super(decoratedDigitalItem);
		// TODO Auto-generated constructor stub
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourse() {
		return this.course;
	}

}
