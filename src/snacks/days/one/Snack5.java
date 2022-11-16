package snacks.days.one;

public class Snack5 {

	public static void main(String[] args) {
		
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		// permette di avere il valore massimo dell'int
		int smallerInt = Integer.MAX_VALUE;
		int biggerInt = Integer.MIN_VALUE;
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] < smallerInt) {
				smallerInt = arr[i];
			}else if(arr[i] > biggerInt) {
				biggerInt = arr[i];
			}
			
			sum += arr[i];
			
		}
		
		int avg = sum / arr.length;
		
		System.out.println("Smaller number: " + smallerInt);
		System.out.println("Bigger number: " + biggerInt);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
		
	}
	
}
