/**
 * Harry Potter text based games that utilizes loops, conditionals, and random numbers.
 * Josh Pablico
 * COSC-1437.200
 */

public class Lab4b {

	public static void main(String[] args) {
		int gameStart = 0;
		gamePlay(gameStart);
	}

	public static int gamePlay(int gameStart) {
		if (gameStart == 0) {
			System.out.println("The Weasley brothers hand you some floo powder and quickly push you into the fireplace");
			System.out.println("\"You'll need get to Ollivanders Wand emporium in Hogsmeade to get that want fixed...\"");
			System.out.println("\"Hogsmeade clearly as you drop the floo powder...\"");
			return gameStart = 1;
		}
		return gameStart; // Add a return statement
	}
}
	
	}
		
	// Method to randomize spell cast
	public static String spellCast(int randomNumber) {
		String Alohomora = "Alohomora";
		String Immobulus = "Immobulus";
		String Wingardium = "Wingardium Leviosa";

		if(randomNumber <= 33) {
			return Alohomora;
		} else if(randomNumber <= 66) {
			return Immobulus;
		} else {
			return Wingardium;
		}
	}

	// Method to generate a random number
	public static int randomNumber() {
		int rndNum = (int)(Math.random() * 100) + 1;
		return rndNum;
	}
 }
