/**
 * 
 * @author Michelle Li
 * Period 1
 * 
 * This program computes pay given tax rates
 */

public class Taxes {
	
	/**
	 * Instance variables: hoursWorked, hourlyRate
	 */
	private double hoursWorked, hourlyRate;
	/**
	 * Private final variables for the tax rates in decimal form
	 */
	private final double FEDERAL_RATE = 0.15, FICA_RATE = 0.0765, STATE_RATE = 0.04;
	/**
	 * Constructor to initalize the hoursWorked and hourlyRate instance variables
	 * @param work: hours worked
	 * @param rate: hourly rate
	 */
	public Taxes(double work, double rate) {
		hoursWorked = work;
		hourlyRate = rate;
	}
	
	/**
	 * Getter method getHoursWorked() to return hours worked
	 * @return hoursWorked
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}
	/**
	 * Getter method getHourlyRate() to return hourly rate
	 * @return hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}
	/**
	 * Getter method getFedTaxRate() to return federal tax rate
	 * @return FEDERAL_RATE
	 */
	public double getFedTaxRate() {
		return FEDERAL_RATE;
	}
	/**
	 * Getter method getSocSecurityRate() to return social security tax rate
	 * @return FICA_RATE
	 */
	public double getSocSecurityRate() {
		return FICA_RATE;
	}
	/**
	 * Getter method getStateTaxRate() to return state tax rate
	 * @return STATE_RATE
	 */
	public double getStateTaxRate() {
		return STATE_RATE;
	}
	/**
	 * Method to compute gross pay using hoursWorked and hourlyRate
	 * @return grossPay (hoursWorked * hourlyRate)
	 */
	public double computeGrossPay() {
		double grossPay = hoursWorked * hourlyRate;
		return grossPay;
	}
	/**
	 * Method to compute amount paid in federal taxes using gross pay and federal rate
	 * @return fedTaxAmount (computeGrossPay() * FEDERAL_RATE)
	 */
	public double computeFedTax() {
		double fedTaxAmount = computeGrossPay() * FEDERAL_RATE;
		return fedTaxAmount;
	}
	/**
	 * Method to compute amount paid in social security taxes using gross pay and FICA rate
	 * @return socSecAmount (computeGrossPay() * FICA_RATE)
	 */
	public double computeSocSecurity() {
		double socSecAmount = computeGrossPay() * FICA_RATE;
		return socSecAmount;
	}
	/**
	 * Method to compute amount paid in social security taxes using gross pay and state rate
	 * @return stateAmount (computeGrossPay() * STATE_RATE)
	 */
	public double computeStateTax() {
		double stateAmount = computeGrossPay() * STATE_RATE;
		return stateAmount;
	}
	/**
	 * Method to compute total amount paid to taxes
	 * @return total (computeFedTax() + computeSocSecurity() + computeStateTax())
	 */
	public double computeTotalTax() {
		double total = computeFedTax() + computeSocSecurity() + computeStateTax();
		return total;
	}
	/**
	 * Method to compute net pay after paying all taxes
	 * @return netPay (computeGrossPay() - computeTotalTax())
	 */
	public double computeNetPay() {
		double netPay = computeGrossPay() - computeTotalTax();
		return netPay;
	}
}
