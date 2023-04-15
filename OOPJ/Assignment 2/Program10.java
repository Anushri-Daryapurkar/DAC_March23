package org.credit.example;

import java.util.Scanner;

class CreditScore{
	int creditHistory;
	double creditUtilization;
	boolean paymentHistory;
		
	public CreditScore() {

	}

	public CreditScore(int creditHistory, double creditUtilization, boolean paymentHistory) {
		super();
		this.creditHistory = creditHistory;
		this.creditUtilization = creditUtilization;
		this.paymentHistory = paymentHistory;
	}

	public int getCreditHistory() {
		return creditHistory;
	}

	public void setCreditHistory(int creditHistory) {
		this.creditHistory = creditHistory;
	}

	public double getCreditUtilization() {
		return creditUtilization;
	}

	public void setCreditUtilization(double creditUtilization) {
		this.creditUtilization = creditUtilization;
	}

	public boolean isPaymentHistory() {
		return paymentHistory;
	}

	public void setPaymentHistory(boolean paymentHistory) {
		this.paymentHistory = paymentHistory;
	}
	
	int calculateCreditScore() {
		int creditScore;
        if (paymentHistory) {
            creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
        } else {
            creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
        }
        return creditScore;
	}	
}

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CreditScore c = new CreditScore();
		
		System.out.println("Enter credit history: ");
		int creditHistory = sc.nextInt();
		c.setCreditHistory(creditHistory);
		
		System.out.println("Enter credit utilization: ");
		double creditUtilization = sc.nextDouble();
		c.setCreditUtilization(creditUtilization);
		
		System.out.println("Payment History good or bad? (true/false): ");
		boolean paymentHistory = sc.nextBoolean();
		c.setPaymentHistory(paymentHistory);
		
		int credit_score = c.calculateCreditScore();
		System.out.println("Credit Score: " + credit_score);
		
		
		
		
		
	}

}
