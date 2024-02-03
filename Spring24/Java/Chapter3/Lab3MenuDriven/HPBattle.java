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
				System.out.println("Harry walks up to the pensive.");
				System.out.println("What memory does Harry wish to relive?");
				System.out.println("1. Drowning in the swarm of Grindylows in the Black Lake");
				System.out.println("2. Confronting a Troll that escaped the dungeon");
				System.out.println("3. Battling the Basilisk inside the chamber of secrets");
				System.out.println("4. A Dementor's kiss");
				System.out.println("0. Run away!");
				menuInputInt = input.nextInt();
					if (menuInputInt == 1) {
						System.out.println("Harry has chosen the Black lake and the swarm of Grindylows...");
						System.out.println("How much health did Harry have?");
						int hp = input.nextInt();
							if (hp > grindylow) {
								System.out.println("Relashio!");
								System.out.println("Harry forced the Grindylows to release him!");
								hp = hp - grindylow;
								System.out.println("Harry survives the second task with " + hp + " health remaining.");
							} else {
								System.out.println("Harry is drowned and dragged to the depths of the Blake Lake....");
								System.out.println("This memory is quite different...");
							}
					} else if (menuInputInt == 2) {
						System.out.println("Harry remembers the Troll roaming the halls...");
						System.out.println("How much health did Harry have?");
						int hp = input.nextInt();
							if (hp > troll) {
								hp = hp - troll;
								System.out.println("Wingardium Leviosa!");
								System.out.println("With Hermoine's help, Harry Potter survives his encounter with the troll with " + hp + " health left");
							} else {
								System.out.println("Harry has been flattened by the Troll!");
								System.out.println("You've ended a franchise.");
							}
					} else if (menuInputInt == 3) {
						System.out.println("The first time meeting Tom Riddle and the Basilisk...");
						System.out.println("How much health did Harry have left after a deathly game of Chess?");
						int hp = input.nextInt();
							if (hp > basilisk) {
								hp = hp - basilisk;
								System.out.println("Harry pluges the Sword of Grifindore in the Basiliks mouth!");
								System.out.println("Harry survives with " + hp + " health and saves Ginnie.");
							} else {
								System.out.println("Voldemort is revived, the Death Eaters prevailed.");
							}
					} else if (menuInputInt == 4) {
						System.out.println("The Dementors swarm Harry and Sirius at the lake!");
						System.out.println("Is Harry's Patronus Charm strong enough? (Y/N)");
						String patronus = input.next();
							if (patronus.equalsIgnoreCase("Y")) {
								System.out.println("How much strenght does Harry have left?");
								int hp = input.nextInt();
									if (hp > dementor) {
										hp = hp - dementor;
										System.out.println("Future Harry Potter has saved Harry Potter!?");
										System.out.println("Which Harry Potter has " + hp + " health left?");
									} else {
										System.out.println("The Dementor stole a kiss...");
									}
							} else {
								System.out.println("Harry's Patronus charm is too weak against all the Dementors!");
								System.out.println("Sirius and Harry lose their souls...!");
							}
					} else if (menuInputInt == 0) {
						System.out.println("Thank you for playing!");
					} else {
						System.out.println("Invalid input. Please try again.");
					}
				}
			}
		}