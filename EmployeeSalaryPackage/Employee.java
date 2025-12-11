package EmployeeSalaryPackage;

public class Employee {
private String name;
private int hourlyRate;
private int workedHours;

public Employee() {}

public Employee(String name,int hourlyRate,int workedHours) {
	this.name=name;
	this.hourlyRate=hourlyRate;
	this.workedHours=workedHours;
}

public int calculateSalary() {
	return workedHours*hourlyRate;
}

@Override
public String toString() {
    return name + " - Salary: " + calculateSalary();
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getHourlyRate() {
	return hourlyRate;
}

public void setHourlyRate(int hourlyRate) {
	this.hourlyRate = hourlyRate;
}

public int getWorkedHours() {
	return workedHours;
}

public void setWorkedHours(int workedHours) {
	this.workedHours = workedHours;
}
}
