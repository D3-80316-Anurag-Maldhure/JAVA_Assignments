package com.employee;

public class Labor implements Emp{
	int hours;
	double rate;
	
	public Labor() {
	}
	
	public Labor(int hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double calcIncentives() {
		//5% of salary if hours > 300, otherwise no incentives)
		if(hours>300) {
			return 0.05*getSal();
		}
		return 0.0;
	}

	@Override
	public double getSal() {
		return hours * rate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Labor [hours=").append(hours).append(", rate=").append(rate).append("]");
		return builder.toString();
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
