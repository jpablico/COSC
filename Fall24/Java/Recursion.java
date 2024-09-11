import java.util.Scanner;

public class Recursion {
	
	public static int recursiveSum(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = kbd.nextInt();
        System.out.println("Sum of integers from 1 to " + n + ": " + recursiveSum(n));
    }
}