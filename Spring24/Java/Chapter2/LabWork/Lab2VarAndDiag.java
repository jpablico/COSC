package LabWork;
import javax.swing.JOptionPane;

	/*
	 * This program demonstrates the use of variables and dialog boxes with JOptionPane.
	 * Author: Josh Pablico
	 * Section: COSC-1437.200
	 */

public class Lab2VarAndDiag {

	public static void main(String[] args) {
		String name;				 // To read the user's name
		String inputString;		// To read the user's numerical inputs
		int  userlvl; 					 // To hold the user's age
		int bossLvl;			    // To hold the user's input temporarily

		// Get the User's name
		name = JOptionPane.showInputDialog("What is a your character's name?");

		// Get the User's level
		inputString = JOptionPane.showInputDialog("What is your character's level?");

		// Convert inputString to int and store in level
		userlvl = Integer.parseInt(inputString);

		// Get the Boss's level
		inputString = JOptionPane.showInputDialog("What is the boss's level?");

		// Convert inputString to int and store in bossLvl
		bossLvl = Integer.parseInt(inputString);

		// Mad Libs logic and results display
		// If the user's level is greater than or equal to the boss's level, then the user can defeat the boss
		if (userlvl >= bossLvl) {
			JOptionPane.showMessageDialog(null, "Hello " + name + ". Your character is level " + userlvl + ". The boss is level " + bossLvl + ".\n" + "You can defeat the boss!");
		} else {
			JOptionPane.showMessageDialog(null, "Hello " + name + ". Your character is level " + userlvl + ". The boss is level " + bossLvl + ".\n" + "You cannot defeat the boss!");
		} 
	}
}