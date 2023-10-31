package com.ecorp.office;

import java.util.Scanner;
import com.ecorp.exception.EmployeeException;

public class Salesman extends Employee{
	private int target;
	private double commission;
	
	public Salesman() {
		super();
		this.target = 1;
		this.commission = 1;
	}

	public Salesman(String name, int age, int id, double salary, int target, double commission) {
		super(name, age, id, salary);
		
		if(target <= 0)
			throw new EmployeeException("target", target);
		this.target = target;
		
		if(commission <= 0)
			throw new EmployeeException("commission", commission);
		this.commission = commission;
	}

	public int getTarget() {
		return target;
	}

	public double getCommission() {
		return commission;
	}

	public void setTarget(int target) {
		if(target <= 0)
			throw new EmployeeException("target", target);
		this.target = target;
	}

	public void setCommission(double commission) {
		if(commission <= 0)
			throw new EmployeeException("commission", commission);
		this.commission = commission;
	}

	@Override
	public double calcSalary() {
		return (salary + this.commission);
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		
		System.out.print("Enter target: ");
		int target = sc.nextInt();
		
		if(target <= 0)
			throw new EmployeeException("target", target);
		this.target = target;
		
		System.out.print("Enter commission: ");
		double commission = sc.nextDouble();
		
		if(commission <= 0)
			throw new EmployeeException("commission", commission);
		this.commission = commission;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nTarget: %d\nCommission: %.2f", super.toString(), this.target, this.commission);
	}
}
