package snacks.days.one;

import java.util.Random;

public class Snack2 {
	
	public static void main(String[] args) {
		
		String[] guestsNames = {
				"gianni",
				"gino",
				"antonello",
				"alessandro",
				"rolando"
		};
		
		String[] guestsSurnames = {
				"rossi",
				"alberti",
				"verdone",
				"rosetti",
				"bertelli"
				
		};
		
		String[] guestsFullNames = new String[5];
		
		Random rnd = new Random();
		
		System.out.println("La lista degli invitati: ");
//		for (int i = 0; i < guestsNames.length; i++) {
//			
//			int randomName = rnd.nextInt(guestsNames.length);
//			int randomSurname = rnd.nextInt(guestsSurnames.length);
//			
//			System.out.println(guestsName[randomName] + " " + guestsSurname[randomSurname]);
//		}
		
		for (int i = 0; i < guestsNames.length; i++) {
			
			String name = guestsNames[i];
			
			int surnameIndex = rnd.nextInt(guestsSurnames.length);
			String rndSurname = guestsSurnames[surnameIndex];
			
			String fullname = name + " " + rndSurname;
			
			guestsFullNames[i] = fullname;
			
			System.out.println(guestsFullNames[i]);
		}
		
	}
	
}
