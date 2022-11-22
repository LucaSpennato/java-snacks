package snacks.days.two;

public class Boss extends Person {

	private int salary;
	private int bonus;
	
	public Boss(String name, String surname, int salary, int bonus) {
		
		super(name, surname);
		
		setSalary(salary);
		setBonus(bonus);
	}

	
	
	public int getSalary() {
		return salary;
	}
	private void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	private void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public int getYearIncome() {
		
		return getBonus() + (getSalary() * 14);
	}
	
	@Override
	public String toString() {
		
		return "Boss:\n" + super.toString();
	}
	
}
