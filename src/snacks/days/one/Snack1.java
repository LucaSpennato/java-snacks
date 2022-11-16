package snacks.days.one;

import java.util.Scanner;

public class Snack1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int catchNumber = sc.nextInt();
		
//		if(catchNumber %2 == 0) {
//			System.out.println("Even!: " + catchNumber);
//		}else {
//			System.out.println("Let's fix that: " + (catchNumber + 1));
//		};
		
		System.out.println(catchNumber %2 == 0 ? "Even!: " + catchNumber : "Let's fix that: " + (catchNumber + 1));
		
	}
	
}
