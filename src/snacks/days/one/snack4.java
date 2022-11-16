package snacks.days.one;

import java.util.Random;

public class snack4 {
	
	public static void main(String[] args) {
		
		int[] array1 = new int[5];
		
		int[] array2 = new int[10];
		
		Random rnd = new Random();
		
		int arrayDiff = array2.length - array1.length;
		
		
		for (int i = 0; i < arrayDiff; i++) {
			
			int rndValue = rnd.nextInt(20);
			
			System.out.println(rndValue);
			
		}
	}

}
