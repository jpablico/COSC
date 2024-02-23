/**
 * Author: Josh Pablico
 * COSC-1437.200
 * Created on Feb. 23, 2024
 */

package Labs.Lab7a;

import java.util.Scanner;
import java.io.*;

public class CovidAnalysis {
	
	public static void main(String[] args) throws IOException{
		int[] sequence = new int[4];

		File fileInput = new File("./covid19sequenceJan2024.txt");

		Scanner fileIn = new Scanner(fileInput);
		while (fileIn.hasNext()) {
			String currentChar = fileIn.next();
				if(currentChar.equals("A")) {
					sequence[0]++;
				} else if(currentChar.equals("T")) {
					sequence[1]++;
				} else if(currentChar.equals("C")) {
				sequence[2]++;
				} else if(currentChar.equals("G")) {
					sequence[3]++;
				}
		}
		fileIn.close();
		System.out.println(sequence);
	}
}
