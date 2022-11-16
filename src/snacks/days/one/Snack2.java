package snacks.days.one;

import java.util.Random;

public class Snack2 {
	
	public static void main(String[] args) {
		
		String[] guestsName = {
				"gianni",
				"gino",
				"antonello",
				"alessandro",
				"rolando"
		};
		
		String[] guestsSurname = {
				"rossi",
				"alberti",
				"verdone",
				"rosetti",
				"bertelli"
				
		};
		
		Random rnd = new Random();
		
		System.out.println("La lista degli invitati: ");
		for (int i = 0; i < guestsName.length; i++) {
			
			int randomName = rnd.nextInt(guestsName.length);
			int randomSurname = rnd.nextInt(guestsSurname.length);
			
			System.out.println(guestsName[randomName] + " " + guestsSurname[randomSurname]);
		}
		
	}
	
}
