package com.ecorp.exception;

public class EmployeeException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;
	private String field;
	private double value;
	
	public EmployeeException() {
		super("Invalid value");
	}
	
	public EmployeeException(String field, double value) {
		super("Invalid " + field + ": " + value);
		this.field = field;
		this.value = value;
	}

	public String getField() {
		return field;
	}

	public double getValue() {
		return value;
	}
}
