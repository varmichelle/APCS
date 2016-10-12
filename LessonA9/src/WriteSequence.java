/**
 * 
 * @author Michelle Li
 * Period 1
 * Class WriteSequence - prints a symmetric sequence of n numbers
 *
 */
public class WriteSequence {

	/**
	 * Method write to print the symmetric sequence
	 * @param n - specifies the length of the sequence
	 */
	public void write(int n) {
		// termination case
		if (n <= 0) return;
		// special case for n odd, if n=1 just print one 1 and return
		if (n == 1) {
			System.out.print("1 ");
			return;
		}
		// if n is even, print n/2
		else if (n % 2 == 0) {
			System.out.print(n/2 + " ");
			write(n-2);
			System.out.print(n/2 + " ");
			return;
		// if n is odd, print n/2 + 1
		} else {
			System.out.print((n/2+1) + " ");
			write(n-2);
			System.out.print((n/2+1) + " ");
			return;
		}
	}

}
