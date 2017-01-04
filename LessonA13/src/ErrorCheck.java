
public class ErrorCheck {

	private double myBalance;
	private int myAccountNumber;
	
	/**
	 * Constructor to set myBalance and myAccountNumber to 0
	 */
	public ErrorCheck() {
		myBalance = 0;
		myAccountNumber = 0;
	}
	
	/**
	 * Constructor to initialize balance and account number
	 * @param initialBalance - amount in account
	 * @param acctNum - account identifier
	 * @throws Exception - Negative balance in account
	 */
	public ErrorCheck(double initialBalance, int acctNum) throws Exception {
		myAccountNumber = acctNum;
		if (initialBalance < 0) throw new Exception("Negative balance in account " + myAccountNumber);
		else myBalance = initialBalance;
	}
	
	/**
	 * Returns current balance
	 * @return myBalance - current balance
	 */
	public double getBalance() {
		return myBalance;
	}
	
	/**
	 * Deposit amount into account
	 * @param amount - amount to deposit
	 * @throws Exception - Negative amount deposited in account
	 */
	public void deposit(double amount) throws Exception {
		if (amount < 0) throw new Exception("Negative amount deposited in account " + myAccountNumber);
		else myBalance += amount;
	}
	
	/**
	 * Withdraw amount from account
	 * @param amount - amount to withdraw
	 * @throws Exception - Account overdrawn
	 */
	public void withdraw(double amount) throws Exception {
		if (amount > myBalance) throw new Exception("Account " + myAccountNumber + " overdrawn");
		else myBalance -= amount;
	}

}
