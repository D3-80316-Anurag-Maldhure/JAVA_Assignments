package com.people;

import java.util.Scanner;

import com.customexceptionhandler.EmployeeException;

public class Salesman extends Employee {

	private double target;
	private double comm;
	
	public Salesman() {
	}	
	
	public Salesman(double target, double comm) {
		super();
		this.target = target;
		this.comm = comm;
	}

	public Salesman(int id, double salary, double target, double comm) {
		super(id, salary);
		this.target = target;
		this.comm = comm;
	}

	public Salesman(String name, int age, int id, double salary, double target, double comm) {
		super(name, age, id, salary);
		this.target = target;
		this.comm = comm;
	}
	
	public void accept(Scanner sc)throws EmployeeException {
		super.accept(sc);
		System.out.println("Enter Target: ");
		this.setTarget(sc.nextDouble());
		System.out.println("Enter Commission: ");
		this.setComm(sc.nextDouble());
		try {
			this.calcSalary();
		}
		catch(EmployeeException e){
			System.out.println("Error : " + e.getMessage());
		}
	}

	public double getTarget() {
		return target;
	}

	public void setTarget(double target) throws EmployeeException{
		if(target <= 0) {
			throw new EmployeeException("Target", target );
		}
		this.target = target;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) throws EmployeeException {
		if(comm <= 0) {
			throw new EmployeeException("Commission", comm );
		}
		this.comm = comm;
	}

	@Override
	public double calcSalary() throws EmployeeException {
		this.setSalary(this.getSalary() + this.comm);
		if(this.getSalary() < 0 ) {
			throw new EmployeeException("Salary", this.getSalary());
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return String.format("Salesman [name= %s, age= %d, id= %d, target= %f, commission= %f, salary= %f\n", this.getName(), this.getAge(), this.getId(), this.target, this.comm, this.getSalary());
	}
}
