/**
 * Harry Potter text based games that utilizes loops, conditionals, and random numbers.
 * Josh Pablico
 * COSC-1437.200
 */
import java.util.Scanner;

public class Lab4b {
	static Scanner kbd = new Scanner(System.in);
	static int filchLocation = 10;

	public static void main(String[] args) {

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
		System.out.println("As you make your way through the castle, you hear a door creak open and you see a light flicker in the distance");
		System.out.println("You see a figure in the distance, it's Filch! You need to hide!");
		unlockDoor();
		flyingCreatures();
		blockedStairwell();
	}

	// Method to unlock the door
	public static boolean unlockDoor() {
		System.out.println("A locked door is your only option, you need to cast a spell to unlock it");
		System.out.println("but your wand is broken, only a few spells will work");
		System.out.println("To open the door you'll need to cast the unlocking charm, Alohomora (Press enter to cast the spell)");
		kbd.nextLine();
		boolean doorUnlocked = false;
			while(!doorUnlocked) {
				if(spellCast(randomNumber()) == "Alohomora") {
					System.out.println("You've casted Alohomora! The door unlocks and you quickly slip inside");
					System.out.println("You hear Filch's footsteps getting closer, you need to find a place to hide");
					System.out.println("You see a broom closet, you quickly hide inside and close the door");
					System.out.println("You hear Filch's footsteps pass by and you let out a sigh of relief (Press enter to continue)");
					kbd.nextLine();
					doorUnlocked = true;
					return true;
				} else if(spellCast(randomNumber()) == "Immobulus") {
					System.out.println("");
					System.out.println("You've casted Immobulus! but the door remains locked, you need to try again");
					System.out.println("filch hears you and he makes his way towards your direction");
						castleCaretaker();
					System.out.println("You need to be quick, Filch is getting closer (Press enter to cast the spell)");
						kbd.nextLine();
							doorUnlocked = false;
				} else if(spellCast(randomNumber()) == "Wingardium Leviosa") {
					System.out.println("");
					System.out.println("You've casted Wingardium Leviosa!");
					System.out.println("The door lifts off its hinges and flies away, yeah right, you need to try again");
					System.out.println("filch hears you and he makes his way towards your direction");
						castleCaretaker();
					System.out.println("Time to try again! (Press enter to continue)");
						kbd.nextLine();
							doorUnlocked = false;
				}
			}
			return true;
		}

	// Method to get past the flying creatures
	public static boolean flyingCreatures() {
		System.out.println("");
		System.out.println("You make your way through the room, you hear a loud screech and you see a flock of billiwig stingers flying towards you");
		System.out.println("You need to cast a spell to get them to leave you alone");
		System.out.println("You need to cast the freezing charm, Immobulus (Press enter to cast the spell)");
		kbd.nextLine();
		boolean creaturesGone = false;
		while(!creaturesGone) {
			if(spellCast(randomNumber()) == "Immobulus") {
				System.out.println("");
				System.out.println("You've casted Immobulus! The creatures freeze in place and you quickly make your way past them");
				System.out.println("You're getting closer to the common room! (Press enter to continue)");
					kbd.nextLine();
						creaturesGone = true;
							return true;
			} else if(spellCast(randomNumber()) == "Wingardium Leviosa") {
				System.out.println("");
				System.out.println("You've casted Wingardium Leviosa!");
				System.out.println("The billiwigs are already flying, you made them angrier!");
				System.out.println("Filch hears the commotion and he makes his way towards your direction");
				castleCaretaker();
				System.out.println("Try again! (Press enter to cast another spell)");
					kbd.nextLine();
						creaturesGone = false;
			} else if(spellCast(randomNumber()) == "Alohomora") {
				System.out.println("");
				System.out.println("You've casted Alohomora!");
				System.out.println("That spell has no effect! The billiwigs are getting closer!");
				System.out.println("Filch hears the commotion and he makes his way towards your direction");
				castleCaretaker();
				System.out.println("Try again! (Press enter to cast another spell)");
					kbd.nextLine();
						creaturesGone = false;
			}
		}
		System.out.println("");
		System.out.println("The Spell worked! You make your way across the room and quickly close the door behind you");
		System.out.println("You're getting closer to the common room! (Press enter to continue)");
			kbd.nextLine();
				return true;
	}

	public static boolean blockedStairwell() {
		System.out.println("");
		System.out.println("You make your way through the castle, you see a stairwell that's blocked by a fallen stand of armor");
		System.out.println("You need to cast a spell to get it of the way");
		System.out.println("You need to cast the levitation charm, Wingardium Leviosa (Press enter to cast the spell)");
		kbd.nextLine();
		boolean stairwellUnblocked = false;
		while(!stairwellUnblocked) {
			if(spellCast(randomNumber()) == "Wingardium Leviosa") {
				System.out.println("");
				System.out.println("You've casted Wingardium Leviosa!");
				System.out.println("The stand of armor are levitated up and you quickly make your way past it");
				System.out.println("You're just about the enterance of the common room! (Press enter to continue)");
					kbd.nextLine();
						stairwellUnblocked = true;
			} else if(spellCast(randomNumber()) == "Immobulus") {
				System.out.println("");
				System.out.println("You've casted Immobulus!");
				System.out.println("The armor is already frozen in place, if you cast the wrong spell");
				System.out.println("Filch hears the commotion and he makes his way towards your direction");
				castleCaretaker();
				System.out.println("Try again! (Press enter to cast another spell)");
					kbd.nextLine();
						stairwellUnblocked = false;
			} else if(spellCast(randomNumber()) == "Alohomora") {
				System.out.println("");
				System.out.println("You've casted Alohomora!");
				System.out.println("That's not the right spell, the armor remains in place");
				System.out.println("Filch hears the commotion and he makes his way towards your direction");
				castleCaretaker();
				System.out.println("Try again! (Press enter to cast another spell)");
					kbd.nextLine();
						stairwellUnblocked = false;
			}
		}
		System.out.println("");
			System.out.println("You've made it to the common room! You're safe for now! (Press enter to continue)");
				kbd.nextLine();
					System.out.println("Congratulations! You've won the game!");
						return true;
	}

	// Method for Filch's movement in the castle
	public static void castleCaretaker() {
		filchLocation--;
		if(filchLocation == 0) {
			System.out.println("");
			System.out.println("You've been caught by Filch, you're in detention for the rest of the year! Game Over!");
			System.exit(0);
		} else {
			System.out.println("");
			System.out.println("You have " + filchLocation + " turns left before Filch catches you");
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
