/* Banking - Saving Account Annual and Monthly Interest rate Calculation
 * Author - kumar Bamankar
 */
package banking;

public class Main {
	
	/*
	 * Main method for manipulation linkedList
     * @param args - Default Java param (Not used
	 * 
	 */

	public static void main(String[] args) {
		
		/* PROCEDURE
		* 1. Creating object of saving account as saver1 and saver2
		* 2. using method calculateMonthlyInterest to get saver1 balance for first month after interest.
		* 3. Modifying the annual interest rate for next month and getting balance  of next month for both saver1 and saver2.
		*/
		
		// creating an object saver1
		SavingsAccount saver1 = new SavingsAccount(2000, 4);
		saver1.calculateMonthlyInterest();
		System.out.println("Balance of saver1 for first month is " +saver1.getSavingBalance());
		
		//creating an object saver2
		SavingsAccount saver2 = new SavingsAccount(3000, 4);
		saver2.calculateMonthlyInterest();
		System.out.println("Balance of saver2 for first month is " +saver2.getSavingBalance());
		
		// modifying the annual interest rate 
		System.out.println(" ");
		System.out.println("Balance after modifying annual rate for next month");
		saver1.modifyInterestRate(4, 5);
		saver1.calculateMonthlyInterest();
		System.out.println("Balance of saver1 is " +saver1.getSavingBalance());
		
		saver2.modifyInterestRate(4, 5);
		saver2.calculateMonthlyInterest();
		System.out.println("Balance of saver2 is " +saver2.getSavingBalance());


	}

}
