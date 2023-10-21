
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		//Display default details of Employee
		System.out.println("--------------------------");
		System.out.println("Display default details of Employee:");
		e1.displayEmployeeDetails();
		System.out.println("--------------------------");
		e2.displayEmployeeDetails();
		System.out.println("--------------------------");
		
		//Set new details of Employee
		System.out.println("Set new details of Employee:");
		e1.setFirstName("Sandesh");
		e1.setLastName("Tribhuvan");
		e1.setMonthlySalary(-3000); // Wrong entry
		e1.setMonthlySalary(110325.24);
		
		e2.setFirstName("Sainath");
		e2.setLastName("Sheikh");
		e2.setMonthlySalary(112213.55);
		
		e1.displayEmployeeDetails();
		System.out.println("--------------------------");
		e2.displayEmployeeDetails();
		System.out.println("--------------------------");
		
		//Annual Salary of Employee
		System.out.println("Annual Salary of Employee: "+ e1.getFirstName() + " " + e1.getLastName());
		e1.displayAnnualSalary();
		System.out.println("----------------------------------------------------");
		System.out.println("Annual Salary of Employee: "+ e2.getFirstName() + " " + e2.getLastName());
		e2.displayAnnualSalary();
		System.out.println("----------------------------------------------------");
	
		//Increment Salary of Employee by 10%
		e1.incrementSalaryByTenPercent();
		e2.incrementSalaryByTenPercent();
		
		//New Annual Salary of Employee
		System.out.println("New Annual Salary of Employee: "+ e1.getFirstName() + " " + e1.getLastName());
		e1.displayAnnualSalary();
		System.out.println("----------------------------------------------------");
		System.out.println("New Annual Salary of Employee: "+ e2.getFirstName() + " " + e2.getLastName());
		e2.displayAnnualSalary();
		System.out.println("----------------------------------------------------");
		
	}

}
