package snacks.days.two;

import java.time.LocalDate;
import java.util.Random;

public abstract class Person {

	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String corporateCode;
	
	public Person(String name, String surname, LocalDate dateOfBirth) {
		
		setName(name);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);
		setCorporateCode();
		
	}
	
	private void setCorporateCode() {
		Random rnd = new Random();
		corporateCode = rnd.nextInt(99999999) + "";
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	private void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	private void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCorporateCode() {
		return corporateCode;
	}
	
	
}
