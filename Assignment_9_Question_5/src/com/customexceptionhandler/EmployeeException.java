package com.customexceptionhandler;

public class EmployeeException extends Exception{
	
	private String field;
	private double value;
	
	public EmployeeException() {
		super("Invalid Value!");
	}

	public EmployeeException(String field, double value) {
		super("invalid Value : Field: " + field + ", Value: "+ value);
		this.field = field;
		this.value = value;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
