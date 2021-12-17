package com.nguyen;

public class Paycheck implements payroll {
	private double hoursWorked;
	private double payRate;

	Paycheck () {
		hoursWorked = 0;
		payRate = 0;
	}

	Paycheck (double h, double p) {
		hoursWorked = h;
		payRate = p;

	}

	public void setHoursWorked (double h) {
		hoursWorked = h;
	}
	public double getHoursWorked () {
		return hoursWorked;
	}

	public void setPayRate (double p) {
		payRate = p;

	}
	public double getPayRate () {
		return payRate;
	}

	public double regularPay () {
		double payValue;

		if (hoursWorked >= 40) {
			payValue = payRate * 40;
		} else {
			payValue = payRate * hoursWorked;
		}

		return payValue;
	}

	public double overTimepay () {
		double payValue;

		if (hoursWorked <= 40) {
			payValue = 0;
		} else {
			payValue = payRate * (hoursWorked - 40);
		}

		return payValue;
	}


	public double totalPay () {
		double payValue = regularPay() + overTimepay();

		String message = String.format("Total Pay: %.02f", payValue);

		System.out.println(message);

		return payValue;
	}
	

}


