package Chapter4;
import java.util.Scanner;

public class practiceloops {
	
	public static void main(String[] args) {
		System.out.println("Give me a number between 5 and 10:");
		Scanner input = new Scanner(System.in);

		int number = input.nextInt();
		while (number < 5 || number > 10) {
			System.out.println("That number is not between 5 and 10. Try again:");
			number = input.nextInt();
		}
		System.out.println("Thank you for the number!");
		System.out.println("You gave me the number: " + number);
		System.out.println("You gave me the number " + number + " correct?");

		String validation = input.nextLine();
		while(validation != "n" && validation != "N") {
			System.out.println("Shall we try again?");
			validation = input.nextLine();
		}
		System.out.println("Thanks again!");

	}
}
