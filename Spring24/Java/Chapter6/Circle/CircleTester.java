package Circle;

import java.util.Scanner;

public class CircleTester {
	
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(String.format("%.2f", c.getArea()));
	
		Scanner kbd = new Scanner(System.in);
		double value;
		System.out.println("Value for new Circle: ");
		value = kbd.nextInt();
		Circle c2 = new Circle(value);
		System.out.println(String.format("%.2f", c2.getArea()));
	}
}
