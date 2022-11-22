package snacks.days.two;

public class Employee extends Person{

	private int salary;
	private int monthlyCount;
	
	public Employee(String name, String surname, int salary, int monthlyCount) {
		
		super(name, surname);
		setSalary(salary);
		setMonthlyCount(monthlyCount);
	}

	
	
	public int getSalary() {
		return salary;
	}
	private void setSalary(int salary) {
		this.salary = salary;
	}
	public int getMonthlyCount() {
		return monthlyCount;
	}
	private void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}


	@Override
	public int getYearIncome() {
		return getSalary() * getMonthlyCount();
	}
	
	@Override
	public String toString() {
		
		return "Employee:\n" + super.toString();
	}
	
}
