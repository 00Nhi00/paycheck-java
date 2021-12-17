package com.nguyen;
import com.nguyen.Paycheck;

public class Main {
	public static void main (String[] arg) {
		Paycheck paycheck = new Paycheck();
		System.out.println(String.format("Regular Pay: %.02f", paycheck.regularPay()));
		paycheck.setHoursWorked(39.50);
		paycheck.setPayRate(10);
		System.out.println(String.format("Regular Pay: %.02f", paycheck.regularPay()));
		paycheck.setHoursWorked(42);
		System.out.println(String.format("Overtime Pay: %.02f", paycheck.overTimepay()));
	
		String.format("Total Pay: %.02f", paycheck.totalPay());
	}
}

