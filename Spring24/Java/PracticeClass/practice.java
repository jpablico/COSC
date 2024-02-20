package PracticeClass;

import java.util.Random;

public class practice {
	
	public static void main(String[] args) {
		
		int [][] array = new int[6][4];
		
		for(int x = 0; x<array.length; x++) {
			for(int i = 0; i<array[x].length; i++){
				array[x][i] = randomNumber();
			}

		}
		System.out.println(array);
	}

	public static int randomNumber() {
		int rndNum = (int)(Math.random() * 100) + 1;
		return rndNum;
	}
}
