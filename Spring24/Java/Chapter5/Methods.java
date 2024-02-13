package Chapter5;
import java.util.Scanner;

public class Methods {
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please enter a number to triple: ");
		int num = kbd.nextInt();
		triple(num);
	}

	public static void triple(int num) {
		int tripled = num * 3;
		System.out.println("The value is tripled to " + tripled);
	}
}
