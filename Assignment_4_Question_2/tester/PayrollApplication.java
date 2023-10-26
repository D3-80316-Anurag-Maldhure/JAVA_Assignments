package com.tester;

import com.company.*;
import com.company.Employee;

public class PayrollApplication {

	public static void main(String[] args) {
		Employee employee = new BasePlusCommissionEmployee(213.123,124,214);
		employee.toString();
		employee.earnings();
		employee.incrementBaseSalaryBy10Percent();
	}

}
