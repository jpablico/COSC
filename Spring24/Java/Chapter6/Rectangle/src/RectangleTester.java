public class RectangleTester {
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();

		System.out.println(r.getLength());
		r.setLength(8);
		r.setWidth(5);
		System.out.println(r.getLength());
		System.out.println(r.getWidth());

		System.out.println(r.getArea());
	}

}
