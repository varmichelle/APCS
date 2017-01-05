/**
 * Class Average to calculate average of numbers in a file (and handle exceptions
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;
import java.io.*;

public class Average {
	
	private String fileName;
	
	/**
	 * Constructor to initialize file name
	 * @param fileName - name of file to open
	 */
	public Average(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * Read in data and calculate the average (handle exceptions)
	 * @return average - average of numbers in file
	 * @throws Exception - file is empty or does not have numeric data
	 */
	public double scanDataAndCalculateAverage() throws Exception {
		File f = new File(fileName);
		// check if file exists
		if (!f.exists()) throw new Exception("Error: " + fileName + " (The system cannot find the file specified");
		Scanner in = new Scanner(f);
		// check if file is empty
		if (!in.hasNext()) throw new Exception(fileName + " is empty");
		int count = 0, sum = 0;
		while (in.hasNextInt()) {
			sum += in.nextInt();
			count++;
		}
		// check if file has numerical data
		if (count == 0) throw new Exception(fileName + " does not have numeric data");
		double average = (sum * 1.0) / count;
		return average;
	}
	
}
