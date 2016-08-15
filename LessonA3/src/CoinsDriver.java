/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */
import java.util.Scanner;

public class CoinsDriver {
	
	public static void main(String[] args) {
		
		boolean done = false;
		Scanner sc = new Scanner(System.in);
		while (!done) {
			// Ask for input
			System.out.print("Enter the cents: ");
			// Read in data
			int money = sc.nextInt();
			if (money == 0) done = true;
			else {
				// Calculate change
				Coins c = new Coins(money);
				c.change();
			}
		} 
		sc.close();
	}
}
