/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class LoanTable {
	
	double principal;
	int years;
	double low;
	double high;

	/**
	 * Constructor
	 * @param principal - principal amount borrowed
	 * @param years - number of years for the loan to be paid off
	 * @param low - low interest rate
	 * @param high - high interest rate
	 */
	public LoanTable(double principal, int years, double low, double high) {
		this.principal = principal;
		this.years = years;
		this.low = low;
		this.high = high;
	}
	
	/**
	 * Prints the loan table
	 */
	public void printTable() {
		// table heading
		System.out.println("Annual Interest Rate    Monthly Payment\n");
		for (double rate = low; rate <= high; rate += 0.25) {
			// print annual interest rate
			System.out.printf("%15.2f", rate);
			// compute monthly payment
			double k = (rate / 100.0) / 12.0;
			int n = years * 12;
			double c = Math.pow(k + 1, n);
			// print monthly payment
			System.out.printf("%17.2f", (principal * k * c) / (c - 1));
			System.out.println();
		}
	}

}
