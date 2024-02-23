/**
 * This class analyzes a COVID-19 sequence file and counts the occurrences of each character (A, T, C, G).
 * @author Josh Pablico
 * COSC-1437.200
 */

import java.util.Scanner;
import java.io.*;


public class CovidAnalysis {
    
    public static void main(String[] args) throws IOException{
        int[] sequence = new int[4];

        File fileInput = new File("covid19sequenceJan2024.txt");

        Scanner fileIn = new Scanner(fileInput);
			while (fileIn.hasNextLine()) {
				String line = fileIn.nextLine();
				for (char currentChar : line.toCharArray()) {
					if(currentChar == 'A') {
						sequence[0]++;
					} else if(currentChar == 'T') {
						sequence[1]++;
					} else if(currentChar == 'C') {
						sequence[2]++;
					} else if(currentChar == 'G') {
						sequence[3]++;
					}
				}
			}
        fileIn.close();

		int totalNucleotides = sequence[0] + sequence[1] + sequence[2] + sequence[3];

		System.out.println("COVID-19 sequence analysis: \n");
		System.out.println("Total number of nucleotides: " + totalNucleotides + "\n");
		System.out.println("Sequence Analysis:");
		System.out.println("A: " + sequence[0] + " " + percentage(sequence[0], totalNucleotides) + "%");
		System.out.println("T: " + sequence[1] + " " + percentage(sequence[1], totalNucleotides) + "%");
		System.out.println("C: " + sequence[2] + " " + percentage(sequence[2], totalNucleotides) + "%");
		System.out.println("G: " + sequence[3] + " " + percentage(sequence[0], totalNucleotides) + "%");
    }

	public static String percentage(int sequence, int total) {
		float percentage = (float) sequence / total * 100;
		return String.format("%.2f", percentage);
	}
}