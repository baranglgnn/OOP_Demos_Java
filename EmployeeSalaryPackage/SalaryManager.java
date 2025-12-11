package EmployeeSalaryPackage;

import java.util.ArrayList;

public class SalaryManager{

	private ArrayList<Employee> employee = new ArrayList<Employee>();
	
	public void addEmployee(Employee e) {
		employee.add(e);
	}
	
    public Employee getHighestSalaryEmployee() {
        Employee maxEmployee = employee.get(0);

        for (Employee e : employee) {
            if (e.calculateSalary() > maxEmployee.calculateSalary()) {
                maxEmployee = e;
            }
        }

        return maxEmployee;
    }
	
	public void printAllSalaries() {
		for (Employee employee2 : employee) {
			System.out.println(employee2.getName() + "-" + employee2.getHourlyRate() + "-" + employee2.getWorkedHours());
		}
	}
	
	public ArrayList<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
	}
}
