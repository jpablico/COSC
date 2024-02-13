package Chapter5;
import java.util.Scanner;

public class Methods {
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please enter a number to triple: ");
		int num = kbd.nextInt();
		triple(num);

		System.out.println("Validating if the value is within range of 100 and 0: " + isValid(num));

	}

	public static void triple(int num) {
		int tripled = num * 3;
		System.out.println("The value is tripled to " + tripled);
	}

	public static boolean isValid(int value) {
		if(value < 100 && value > 0) {
			return true;
		} else {
			return false;
		}
	}
}
