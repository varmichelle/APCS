import java.util.*;
import java.io.*;

/**
 * Chapter AB23 - Two-Dimensional Arrays Exercises
 * Class MatrixManipulator - perform various operations on 2D arrays
 * @author Michelle Li
 * @period 1
 */

public class MatrixManipulator {
   
	Scanner scan;

	/**
	 * Constructor to initialize scanner
	 */
    public MatrixManipulator() {
        scan = new Scanner(System.in);
    }

    /**
     * Returns sum of all array elements
     * @param data - array to sum elements from
     * @return sum of elements
     */
    public int sumOfAllArrayElements(int[][] data) {
    	int sum = 0;
    	for (int i = 0; i < data.length; i++) {
    		for (int j = 0; j < data[i].length; j++) {
    			sum += data[i][j];
    		}
    	}
        return sum;
    }

    /**
     * Return an array of the sums of each row
     * @param data - array whose elements are to be summed
     * @return array of sums of each row
     */
    public int[] sumOfEachRow(int[][] data) {
        // declare the row sum array
        int[] sums = new int[data.length];
        // compute the sums for each row
        for (int row = 0; row < data.length; row++) {
            for (int j = 0; j < data[row].length; j++) {
            	sums[row] += data[row][j];
            }
        }
        return sums;
    }

    /**
     * Return an array containing the sum of each column
     * @param data - array of data to be summed
     * @return array of sums of each column
     */
    public int[] sumOfEachColumn(int[][] data) {
        // find the longest row
    	int longest = 0;
        for (int i = 0; i < data.length; i++) {
        	longest = Math.max(longest, data[i].length);
        }
        int[] sums = new int[longest];
    	for (int i = 0; i < longest; i++) {
    		for (int j = 0; j < data.length; j++) {
    			if (data[j].length > i) sums[i] += data[j][i];
    		}
    	}
        return sums;
    }
    
    /**
     * Checks if the array is a magic square
     * @param data - array to check
     * @return whether or not the array is a magic square
     */
    public boolean isMagic(int[][] data) {
    	int length = data.length;
    	for (int i = 0; i < data.length; i++) {
    		if (data[i].length != length) return false;
    	}
    	int[] rows = sumOfEachRow(data);
    	for (int i = 1; i < rows.length; i++) {
    		if (rows[i] != rows[0]) return false;
    	}
    	int[] cols = sumOfEachColumn(data);
    	for (int i = 1; i < cols.length; i++) {
    		if (cols[i] != cols[0]) return false;
    	}
    	if (rows[0] != cols[0]) return false;
    	int sum1 = 0, sum2 = 0;
    	for (int i = 0; i < data.length; i++) {
    		sum1 += data[i][i];
    		sum2 += data[data.length-i-1][i];
    	}
    	if (sum1 != sum2 || sum1 != rows[0]) return false;
    	return true;
    }
    
    /**
     * Find the max and min elements 
     * @param data - array whose max/min is desired
     * @return array containing max and min
     */
    public int[] maxAndMinElements(int[][] data) {
        int max = data[0][0];
        int min = data[0][0];
        for (int row = 0; row < data.length; row++) {
        	for (int col = 0; col < data[row].length; col++) {
        		max = Math.max(max, data[row][col]);
        		min = Math.min(min, data[row][col]);
        	}
        }
        int[] result = {max, min};
        return result;
    }

    /**
     * Compute the largest element in each row
     * @param data - array whose largest elements are desired
     * @return array containing largest elements in each row
     */
    public int[] largestElements(int[][] data) {
        int[] largestInRow = new int[data.length];
        for (int row = 0; row < data.length; row++) {
        	for (int col = 0; col < data[row].length; col++) {
        		largestInRow[row] = Math.max(largestInRow[row], data[row][col]);
        	}
        }
        return largestInRow;
    }


    /**
     * Put Description here
     */
    public void reversalOfElementsInEachRow( int[][] data )
    {
    	// reverse each row and print it

    }


    /**
     * Put Description here
     */
    public int[][] imageSmootherEasy( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];

        // Compute the smoothed value for
        // non-edge locations in the image.



        



        return smooth;
    }


    /**
     * Put Description here
     */
    public int[][] imageSmootherHard( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];

        // Compute the smoothed value for all 
        // locations in the image.

        

       
        return smooth;
    }



}
