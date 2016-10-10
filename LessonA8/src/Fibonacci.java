/**
 *   
 * @author Michelle Li
 * Period 1
 * Class Fibonacci - calculates the nth Fibonacci number recursively
 */

public class Fibonacci {
	
	/**
	 * Method fib calculates the nth Fibonacci number
	 * @param n - index of the desired Fibonacci number 
	 * @return
	 */
	public int fib(int n) {
		
		if (n == 0 && n == 1) return n;
		else return fib(n-1) + fib(n-2);
		
	}

}
