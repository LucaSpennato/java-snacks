package snacks.days.one;

import java.util.Random;

public class Snack8 {

	public static void main(String[] args) {
		
		Random rnd = new Random(128);
		
		int[] arr = new int[10];
		
		int sum = 0;
		int biggestInt = Integer.MIN_VALUE;
		int smallestInt = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = rnd.nextInt(100) - 50;
			
			if(arr[i] % 5 == 0 ) {
				sum += arr[i];				
			}
			if(Math.abs(arr[i]) > Math.abs(biggestInt)) {
				biggestInt = arr[i];
			}else if(Math.abs(arr[i]) < Math.abs(smallestInt)) {
				smallestInt = arr[i];
			}
			
		}

		System.out.println("Biggest int: " + biggestInt + " - SmallestInt: " + smallestInt);
		
		System.out.println("Sum: " + sum);
		
	
	}
	
}
