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
		int  age; 					 // To hold the user's age
		int inputTemp;			    // To hold the user's input temporarily

		// Get the User's name
		name = JOptionPane.showInputDialog("What is a your character's name?");

		// Get the User's age
		inputString = JOptionPane.showInputDialog("What is your character's age?");

		// Convert inputString to int age
		age = Integer.parseInt(inputString);



	}
}