
public class Employee {

	String firstName;
	String lastName;
	double monthlySalary;
	
	public Employee() {
		this("TempFirst", "TempLast", 10000.00);
	}
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("First Name: "+ getFirstName());
		System.out.println("Last Name: "+ getLastName());
		System.out.println("Monthly Salary: "+ getMonthlySalary());
	}
	
	public void incrementSalaryByTenPercent() {
		setMonthlySalary(getMonthlySalary()*1.1);
	}
	
	public void displayAnnualSalary() {
		System.out.println("Annual Salary: "+ getMonthlySalary()*12);
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary<0) {
			System.out.println("________________________________________________________________________________");
			System.out.println("ERROR : Since the entered monthly salary is not positive, unable set its value");
			System.out.println("________________________________________________________________________________");
		}
		else {
			this.monthlySalary = monthlySalary;
		}
	}
}
