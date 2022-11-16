package snacks.days.one;

import java.util.Random;

public class Snack3 {

	public static void main(String[] args) {
		
		int[] integerArray = new int[20];
		
		int sum = 0;
		Random rnd = new Random();
		
		for (int i = 0; i < integerArray.length; i++) {
			
			integerArray[i] = rnd.nextInt(10);
			
			if(integerArray[i] % 2 == 1) {
				sum += integerArray[i];
				System.out.println(integerArray[i]);
			}
		}
		
		System.out.println(sum);
	}
	
}
