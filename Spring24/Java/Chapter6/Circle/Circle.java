package Circle;

public class Circle {

	private double radius;
	final double PI = Math.PI;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		radius =7;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (PI * Math.pow(radius, 2));
	}

	public double getCircumference() {
		return (2 * PI * radius);
	}
}
