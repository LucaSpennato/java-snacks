package snacks.days.two;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Ginani", "Sangiorgi", 1600, 12);
		Employee emp2 = new Employee("Robberto", "Andacci", 1300, 12);
		Employee emp3 = new Employee("Gianfranco", "Esposito", 1700, 12);
		
		Boss boss1 = new Boss("Vitantonio", "Antonucci", 3000, 5000);
		Boss boss2 = new Boss("Robberta", "Giannoni", 3200, 6000);
		
		Person[] people = { emp1, emp2, emp3, boss1, boss2 };
		
		
		int maxYearIncome = Integer.MIN_VALUE;
		int minYearIncome = Integer.MAX_VALUE;
		
		int totalCorporatePaychecks = 0;
		
		Person maxIncomePerson = null;
		Person minIncomePerson = null;
		
		// Bonus
		int maxYearIncomeEmployee = Integer.MIN_VALUE;
	
		int maxYearIncomeBoss = Integer.MIN_VALUE;
		
		Employee maxIncomeEmployee = null;
		Boss maxIncomeBoss = null;
		
		for (int i = 0; i < people.length; i++) {
			
			Person personValue = people[i];
			int personYearIncomeValue = personValue.getYearIncome(); 
			
			if(personYearIncomeValue > maxYearIncome) {
				maxYearIncome = personYearIncomeValue;
				maxIncomePerson = personValue;
			}
			if(personYearIncomeValue < minYearIncome) {
				minYearIncome = personYearIncomeValue;
				minIncomePerson = personValue;
			}
			
			totalCorporatePaychecks += personYearIncomeValue;
			
			//Bonus Employee
			
			if(personValue.getClass().equals(Employee.class)) {
				
				if(personYearIncomeValue > maxYearIncomeEmployee) {
					maxYearIncomeEmployee = personYearIncomeValue;
					maxIncomeEmployee = (Employee) personValue;
				}
			}
			
			if(personValue.getClass().equals(Boss.class)) {
				
				if(personYearIncomeValue > maxYearIncomeBoss) {
					maxYearIncomeBoss = personYearIncomeValue;
					maxIncomeBoss = (Boss) personValue;
				}
			}
		
		}
		
		int corporateAvgPaycheck = totalCorporatePaychecks / people.length;
		
		System.out.println("Highest income: " + maxYearIncome + "$");
		System.out.println("Person with the highest income: \n" + maxIncomePerson);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Lowest income: " + minYearIncome + "$");
		System.out.println("Person with the lowest income: \n" + minIncomePerson);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Total corporate paychecks: " + totalCorporatePaychecks + "$");
		System.out.println("Average corporate paychecks: " + corporateAvgPaycheck + "$");
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Employee highest income: " + maxYearIncomeEmployee + "$");
		System.out.println("Employee with highest income: \n" + maxIncomeEmployee);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Boss highest income: " + maxYearIncomeBoss + "$");
		System.out.println("Boss with highest income: \n" + maxIncomeBoss);
	}
	
}
