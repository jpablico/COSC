package Chapter6.classObjectsP1;

public class rectangle {

	private double length;
	private double width;

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
