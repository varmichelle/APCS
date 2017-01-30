import java.util.*;
import java.io.*;

/**
 * Class Compact - Removes all 0s from an array
 * @author Michelle Li
 * @period #1
 */

public class Compact {
	
	// instance variables
	private int[] numbers;
	private final int MAX_NUMBERS = 100;
	private int numberCount = 0;
	
	/**
	 * Read numbers from file into array
	 * @param fileName - name of file to read in from
	 */
	public void readFile(String fileName) {
		try {
			Scanner in = new Scanner(new File(fileName));
			while (in.hasNextInt()) {
				numbers[numberCount] = in.nextInt();
				numberCount++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Constructor to initialize array, read in input, print initial array
	 * @param fileName - name of file to read input from
	 */
	public Compact(String fileName) {
		numbers = new int[MAX_NUMBERS];
		readFile(fileName);
		System.out.print("Before: ");
		printArray();
	}
	
	/**
	 * Compact the array by overriding all 0s with the next element
	 */
	public void compactIt() {
		int copy = numberCount;
		// loop through the array checking for 0s
		for (int i = 0; i < copy; i++) {
			// if 0, shift everything down by 1 index
			if (numbers[i] == 0) {
				for (int j = i + 1; j < copy; j++) {
					numbers[j-1] = numbers[j];
				}
				// account for the shift in index
				i--;
				// to ensure the loop doesn't get stuck looping over the 0s at the end
				copy--;
			}
		}
		System.out.print("After: ");
		printArray();
	}
	
	/**
	 * Private helper method to print the array 
	 */
	private void printArray() {
		for (int i = 0; i < numberCount; i++) {
			if (i != numberCount - 1) System.out.print(numbers[i] + " ");
			else System.out.println(numbers[i]);
		}
	}
	
}
