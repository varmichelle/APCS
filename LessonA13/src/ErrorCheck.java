
public class ErrorCheck {

	private double myBalance;
	private int myAccountNumber;
	
	public ErrorCheck() {
		myBalance = 0;
		myAccountNumber = 0;
	}
	
	public ErrorCheck(double initialBalance, int acctNum) throws Exception {
		myAccountNumber = acctNum;
		if (initialBalance < 0) throw new Exception("Negative balance in account " + myAccountNumber);
		else myBalance = initialBalance;
	}
	
	public double getBalance() {
		return myBalance;
	}
	
	public void deposit(double amount) throws Exception {
		if (amount < 0) throw new Exception("Negative amount deposited in account " + myAccountNumber);
		else myBalance += amount;
	}
	
	public void withdraw(double amount) throws Exception {
		if (amount > myBalance) throw new Exception("Account " + myAccountNumber + " overdrawn");
		else myBalance -= amount;
	}

}
