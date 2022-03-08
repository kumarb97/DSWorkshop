
package banking;

public class SavingsAccount {
	private double savingBalance;
	private double annualInterestRate;
	
//	Constructor
	public SavingsAccount(double savingBalance, double annualInterestRate) {
		super();
		this.savingBalance = savingBalance;
		this.annualInterestRate = annualInterestRate;
	}
/*
 * Getters and setters for Saving balance and annual interest rate
 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getSavingBalance() {
		return savingBalance;
	}
	
	/*
	 * Method to calculate monthly interest.
	 * 
	 */
	public double calculateMonthlyInterest() {
		double monthlyInterest = (savingBalance/100 * annualInterestRate)/12;
		savingBalance = savingBalance + monthlyInterest;
		return savingBalance;
	}
	/*
	 * Method to modify monthly interest.
	 * 
	 */
	public double modifyInterestRate(double annualInterestRate, double newannualInterestRate) {
		annualInterestRate = newannualInterestRate;
		this.annualInterestRate = annualInterestRate;
		return annualInterestRate;
	
	}
	

}
