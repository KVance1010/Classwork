package ClassesExamples;

public class Box {
	private double length, width, height;
	
	public Box() {
		this.length = 1;
		this.width  = 1;
		this.height = 1;		
	}
	
	public Box(double length) {
		this.width = this.length = this.height = length;
	}

	public Box(double length, double width, double height) {
		// super();
		this.length = length;
		this.width = width;
		this.height = height;
		System.out.println(" and the height of " + height + " . ");
	}
	
	public double volume() {
		return length * height* width;
	}
	

}
