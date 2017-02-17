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
	private int[] dx = {-1,0,1,1,1,0,-1,-1,0};
	private int[] dy = {-1,-1,-1,0,1,1,1,0,0};

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
     * Print reverse of each row
     * @param data - array whose elements are to be printed
     */
    public void reversalOfElementsInEachRow(int[][] data) {
    	for (int row = 0; row < data.length; row++) {
    		String s = "";
    		for (int col = data[row].length-1; col >= 0; col--) {
    			s += data[row][col];
    		}
    		System.out.println(s);
    	}
    }

    /**
     * Smooth the inner elements of an image
     * @param image - 2D array to smooth
     * @return smoothed image
     */
    public int[][] imageSmootherEasy(int[][] image) {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];
        for (int col = 0; col < image[0].length; col++) {
        	smooth[0][col] = image[0][col];
        	smooth[smooth.length-1][col] = image[image.length-1][col];
        }
        for (int row = 1; row < image.length-1; row++) {
        	smooth[row][0] = image[row][0];
        	smooth[row][image[0].length-1] = image[row][image[0].length-1];
        }
        for (int row = 1; row < image.length-1; row++) {
        	for (int col = 1; col < image[row].length-1; col++) {
        		for (int i = 0; i < 9; i++) smooth[row][col] = image[row+dy[i]][col+dx[i]];
        		smooth[row][col] /= 9;
        	}
        }
        return smooth;
    }

    /**
     * Smooth the entirety of an image
     * @param image - 2D array to smooth
     * @return smoothed image
     */
    public int[][] imageSmootherHard(int[][] image) {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];
        int[][] padded = new int[image.length+2][image[0].length+2];
        for (int row = 0; row < image.length; row++) {
        	for (int col = 0; col < image.length; col++) {
        		padded[row+1][col+1] = image[row][col];
        	}
        }
        padded = imageSmootherEasy(padded);
        for (int row = 0; row < image.length; row++) {
        	for (int col = 0; col < image.length; col++) {
        		image[row][col] = padded[row+1][col+1];
        	}
        }
        return smooth;
    }

}
