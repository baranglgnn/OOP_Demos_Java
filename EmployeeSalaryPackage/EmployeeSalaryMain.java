package EmployeeSalaryPackage;

public class EmployeeSalaryMain {

	public static void main(String[] args) {
		SalaryManager salaryManager= new EmployeeManager();
        Employee baran = new Employee("Baran",130,40);
        Employee celal = new Employee("Celal",90,30);
        Employee muhammet = new Employee("Muhammet",120,40);
        Employee numan = new Employee("Numan",100,40);
        
        salaryManager.addEmployee(muhammet);
        salaryManager.addEmployee(celal);
        salaryManager.addEmployee(baran);
        salaryManager.addEmployee(numan);
        
        salaryManager.printAllSalaries();
        System.out.println(salaryManager.getHighestSalaryEmployee());
	}

}
