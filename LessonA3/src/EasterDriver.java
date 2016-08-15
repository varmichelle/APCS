/**
 * @author: Michelle Li
 * Period: 1
 */

import java.util.Scanner;

public class EasterDriver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
      	boolean done = false;
      	while (!done)
     	{
       	 	System.out.println("Enter a number, 0 to quit");
        	int y = in.nextInt();
        	if (y == 0) done = true;
        	else {
        		// Calculate month and day
        		Easter e = new Easter(y);
        		e.calculate();
			}
		}
	}

}