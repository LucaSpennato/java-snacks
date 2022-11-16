package snacks.days.one;

import java.util.Random;

public class Snack8 {

	public static void main(String[] args) {
		
		Random rnd = new Random(128);
		
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = rnd.nextInt(100) - 50;
			
			if(arr[i] % 5 == 0 ) {
				sum += arr[i];				
			}
			
			
			
		}

		System.out.println(big + "test");
		
		System.out.println("Sum: " + sum);
		
		
		int biggerInt = 0;
		int smallestInt = 100;
		
		for (int i = 0; i < arr2.length; i++) {
			
			if(arr[i] < 0) {
				arr2[i] = arr[i] * - 1;
			}else{
				arr2[i] = arr[i]; 				
			}
			
			if(arr2[i] > biggerInt) {
				biggerInt = arr2[i];
			}
			if(arr2[i] < smallestInt) {
				smallestInt = arr2[i];
			}

		}
		
		System.out.println("Bigger int: " + biggerInt + " - Smalltest int: " + smallestInt);
	
	}
	
}
