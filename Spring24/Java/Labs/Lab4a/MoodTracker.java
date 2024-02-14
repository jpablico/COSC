/**
 * Program intakes a text file of the users mood and outputs the amount of days per mood and percentage
 * Josh Pablico
 * COSC-1437.200
 * Created on Feb. 13th, 2024
 */

 import java.util.Scanner;
 import java.io.*;
 
 public class MoodTracker {
  
	 public static void main(String[] args) throws IOException {
		 int happyDays = 0;
		 int neutralDays = 0;
		 int sadDays = 0;
 
		 File fileInput = new File("moods.txt");
		 Scanner fileIn = new Scanner(fileInput); 
		 while(fileIn.hasNext()) {
			 String currentLine = fileIn.nextLine();
			 if(currentLine.equals("happy")) {
				 happyDays++;
			 } else if(currentLine.equals("sad")) {
				 sadDays++;
			 } else if(currentLine.equals("neutral")) {
				 neutralDays++;
			 }
		 }
		 int totalDays = neutralDays + happyDays + sadDays;
		 fileIn.close();

		 PrintWriter fileOutput = new PrintWriter("moodResults.txt");
			fileOutput.println("*** Mood Results ***");
			fileOutput.println("Happy days: " + happyDays + " " + percent(happyDays, totalDays) + "%");
			fileOutput.println("Neutral days: " + neutralDays + " " + percent(neutralDays, totalDays) + "%");
			fileOutput.println("Sad days: " + sadDays + " " + percent(sadDays, totalDays) + "%");
				fileOutput.close();
	 }
	
	public static String percent(int day, int total) {
		float percentage = ((float) day / total) * 100;
		return String.format("%.2f", percentage);
	}
 }