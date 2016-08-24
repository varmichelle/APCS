/**
 * @author Michelle Li
 * period #1
 */

import java.util.*;

public class GroceryList {

	public void calculate() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter item#1: ");
		double item1 = scan.nextDouble();
		System.out.print("Enter item#2: ");
		double item2 = scan.nextDouble();
		System.out.print("Enter item#3: ");
		double item3 = scan.nextDouble();
		System.out.print("Enter item#4: ");
		double item4 = scan.nextDouble();
		System.out.print("Enter item#5: ");
		double item5 = scan.nextDouble();
		
		System.out.printf("%10s", "item:");
		System.out.printf("%10s", "cost:");
		System.out.printf("%10s", "total:");
		System.out.println();
		System.out.printf("%10s", "#1");
		System.out.printf("%10.2f", item1);
		System.out.printf("%10.2f", item1);
		System.out.println();
		System.out.printf("%10s", "#2");
		System.out.printf("%10.2f", item2);
		System.out.printf("%10.2f", item1 + item2);
		System.out.println();
		System.out.printf("%10s", "#3");
		System.out.printf("%10.2f", item3);
		System.out.printf("%10.2f", item1 + item2 + item3);
		System.out.println();
		System.out.printf("%10s", "#4");
		System.out.printf("%10.2f", item4);
		System.out.printf("%10.2f", item1 + item2 + item3 + item4);
		System.out.println();
		System.out.printf("%10s", "#5");
		System.out.printf("%10.2f", item5);
		System.out.printf("%10.2f", item1 + item2 + item3 + item4 + item5);
		System.out.println();
	}

}
