package snacks.days.one;

public class Snack6 {

	public static void main(String[] args) {
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		int[] sumArr = new int[arr1.length];
		
		int sum = 0;
		
		int arr1Min = Integer.MAX_VALUE;
		int arr2Min = Integer.MAX_VALUE;
		
		int arr1Max = Integer.MIN_VALUE;
		int arr2Max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr1.length; i++) {
			
			sumArr[i] = arr1[i] + arr2[i];
			
			sum += sumArr[i];
			
			if(arr1[i] < arr1Min) {
				arr1Min = arr1[i];
			}else if(arr1[i] > arr1Max) {
				arr1Max = arr1[i];
			}
			if(arr2[i] < arr2Min ) {
				arr2Min = arr2[i];
			}else if(arr2[i] > arr2Max){
				arr2Max = arr2[i];
			}
			
			System.out.println(sumArr[i]);
		}
		
		float avg = (float) sum / ((float) arr1.length + (float) arr2.length);
		
		System.out.println("Sum both arrays: " + sum + " - Avg both arrays: " + avg);
		
		System.out.println("Min num in arr1: " + arr1Min + " - Arr 2 min: " + arr2Min);
		System.out.println("Max num in arr1: " + arr1Max + " - Arr 2 max: " + arr2Max);
	}
	
}
