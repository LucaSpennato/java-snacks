package snacks.days.one;

import java.util.Scanner;

public class Snack2 {
	
	public static void main(String[] args) {
		
		String[] guests = {
				"gianni",
				"gino",
				"antonello",
				"alessandro",
				"rolando"
		};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Verifica la tua presenza in lista: ");
		String searchYourName = sc.nextLine();
		sc.close();
		
		for (int i = 0; i < guests.length; i++) {
			if(guests[i].equals(searchYourName.toLowerCase())) {
				System.out.println("Il tuo nome è presente!");
				break;
			}
		}
		
	}
	
}
