package snacks.days.two;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Ginani", "Sangiorgi", 1600, 12);
		Employee emp2 = new Employee("Robberto", "Andacci", 1300, 12);
		Employee emp3 = new Employee("Gianfranco", "Esposito", 1700, 14);
		
		Boss boss1 = new Boss("Vitantonio", "Antonucci", 3000, 5000);
		Boss boss2 = new Boss("Robberta", "Giannoni", 3200, 6000);
		
		
		Person[] people = { emp1, emp2, emp3, boss1, boss2 };
		
		int maxYearIncome = Integer.MIN_VALUE;
		
		Person maxIncomePerson = null;
		
		for (int i = 0; i < people.length; i++) {
			
			int personYearIncomeValue = people[i].getYearIncome(); 
			
			if(personYearIncomeValue > maxYearIncome) {
				maxYearIncome = personYearIncomeValue;
				maxIncomePerson = people[i];
				
			}
			
		}
		System.out.println("Highest income: " + maxYearIncome);
		System.out.println("Person with the highest income: \n" + maxIncomePerson);
	}
	
}
