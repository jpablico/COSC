package Lab3MenuDriven;
import java.util.Scanner;

public class HPBattle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int grindylow = 20;
		final int troll = 40;
		final int basilisk = 80;
		final int dementor = 60;

		int menuInputInt = 1;
		while (menuInputInt != 0) {
			System.out.println("Welcome to the Hogwarts Battle Simulator!");
			System.out.println("Please select a monster to battle:");
				System.out.println("1. Grindylow");
				System.out.println("2. Troll");
				System.out.println("3. Basilisk");
				System.out.println("4. Dementor");
				System.out.println("0. Run away!");
				menuInputInt = input.nextInt();
					if (menuInputInt == 1) {
						System.out.println("You have chosen to battle the Grindylow!");
						System.out.println("Please enter your HP:");
						int hp = input.nextInt();
							if (hp > grindylow) {
								System.out.println("You have defeated the Grindylow!");
							} else {
								System.out.println("You have been defeated by the Grindylow!");
							}
					} else if (menuInputInt == 2) {
						System.out.println("You have chosen to battle the Troll!");
						System.out.println("Please enter your HP:");
						int hp = input.nextInt();
							if (hp > troll) {
								System.out.println("You have defeated the Troll!");
							} else {
								System.out.println("You have been defeated by the Troll!");
							}
					} else if (menuInputInt == 3) {
						System.out.println("You have chosen to battle the Basilisk!");
						System.out.println("Please enter your HP:");
						int hp = input.nextInt();
							if (hp > basilisk) {
								System.out.println("You have defeated the Basilisk!");
							} else {
								System.out.println("You have been defeated by the Basilisk!");
							}
					} else if (menuInputInt == 4) {
						System.out.println("You have chosen to battle the Dementor!");
						System.out.println("To defeat the Dementor, you must have a Patronus charm.");
						System.out.println("Do you know the Patronus charm? (Y/N)");
						String patronus = input.next();
							if (patronus.equalsIgnoreCase("Y")) {
								System.out.println("You have the Patronus charm!");
								System.out.println("Please enter your HP:");
								int hp = input.nextInt();
									if (hp > dementor) {
										System.out.println("You have defeated the Dementor!");
									} else {
										System.out.println("You have been defeated by the Dementor!");
									}
							} else {
								System.out.println("You do not have the Patronus charm!");
								System.out.println("You have been defeated by the Dementor!");
							}
					} else if (menuInputInt == 0) {
						System.out.println("Thank you for playing!");
					} else {
						System.out.println("Invalid input. Please try again.");
					}
				}
			}
		}