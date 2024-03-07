public class Rectangle {
    
    private double length;
	private double width;

	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
	}

	public Rectangle() {
		length= 1;
		width= 1;
	}

	public void setLength(double len) {
		length = len;
	}
	
	public void setWidth(double wid) {
		width = wid;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (length*2)+(width*2);
	}
}
