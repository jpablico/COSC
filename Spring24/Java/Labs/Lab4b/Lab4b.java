/**
 * Harry Potter text based games that utilizes loops, conditionals, and random numbers.
 * Josh Pablico
 * COSC-1437.200
 */
import java.util.Scanner;

public class Lab4b {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);

		while(castleCaretaker() != 0) {
			// Game start
			System.out.println("");
			System.out.println("The Weasley brothers hand you some floo powder and quickly push you into the fireplace");
			System.out.println("\"You'll need get to Ollivanders Wand emporium in Hogsmeade to get that wand fixed before he closes\"");
			System.out.println("\"Just say \'Hogsmeade\' clearly as you drop the floo powder\" (Press enter to continue)");
			kbd.nextLine();
			System.out.println("You drop the floo powder and say \"Hogsmeade\" but you bite your tongue...");
			System.out.println("You end up somehwere in the castle, you're not sure where but you need to get back to the common room since it's past curfew");
			System.out.println("You hear Filch's cat, Mrs. Norris, meowing in the distance. You need to be careful");
			System.out.println("You need to get back to the common room before you get caught by Filch or Peeves (Press enter to continue)");
			kbd.nextLine();
			System.out,println("As you make your way through the castle, you hear a door creak open and you see a light flicker in the distance");
			System.out.println("You see a figure in the distance, it's Filch! You need to hide!");
			System.out.println("A locked door is your only option, you need to cast a spell to unlock it");
			System.out.println("You need to cast a spell to unlock the door, but your wand is broken, only a few spells will work");
			System.out.println("To open the door you'll need to cast the unlocking charm, Alohomora (Press enter to cast the spell)");
			kbd.nextLine();
			if(spellCast(randomNumber()) == "Alohomora") {
				System.out.println("The door unlocks and you quickly slip inside");
				System.out.println("You hear Filch's footsteps getting closer, you need to find a place to hide");
				System.out.println("You see a broom closet, you quickly hide inside and close the door");
				System.out.println("You hear Filch's footsteps pass by and you let out a sigh of relief");
				System.out.println("You need to get back to the common room before you get caught by Filch or Peeves (Press enter to continue)");
				kbd.nextLine();
			} else {
				System.out.println("The spell didn't work, you casted the wrong spell, filch hears you and he makes his way towards your direction");

			}
		}


	}

	// Method for Filch's movement in the castle
	public static int castleCaretaker(int failedAttempts) {
		int filchLocation = 7;
		filchLocation -= failedAttempts;
		if(filchLocation== 0) {
			System.out.println("You've been caught by Filch, you're in detention for the rest of the year! Game Over!");
			return 0;
		} else {
			return filchLocation;
		}
		
	}
	// Method to randomize spell cast
	public static String spellCast(int randomNumber) {
		final String ALOHOMORA = "Alohomora";
		final String IMMOBULUS = "Immobulus";
		final String WINGARDIUM = "Wingardium Leviosa";

		if(randomNumber <= 33) {
			return ALOHOMORA;
		} else if(randomNumber <= 66) {
			return IMMOBULUS;
		} else {
			return WINGARDIUM;
		}
	}

	// Method to generate a random number
	public static int randomNumber() {
		int rndNum = (int)(Math.random() * 100) + 1;
		return rndNum;
	}
 }
