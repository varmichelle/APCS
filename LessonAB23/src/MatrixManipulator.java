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

    public MatrixManipulator() {
        scan = new Scanner(System.in);
    }

    /**
     * Put Description here
     */
    public int sumOfAllArrayElements( int[][] data ) {

        // declare the sum
        

        // compute the sum
        
    	
    	
        return sum;
    }


    /**
     * Put Description here
     */
    public int[] sumOfEachRow( int[][] data )
    {
        // declare the row sum array
        
        // compute the sums for each row
        for ( int row = 0; row < data.length; row++ )
        {
            // initialize the sum

            // compute the sum for this row
            
            
        }

        return rowSums;
    }


    /**
     * Put Description here
     */
    public int[] sumOfEachColumn( int[][] data )
    {
        // find the longest row
        

        // declare the col sum array
    	
    	// compute the sum of each column

        return colSums;
    }

    /**
     * Put Description here
     */
    public boolean isMagic( int[][] data )
    {
    	//check if the array is a magic square. This means that it must be square, 
    	//and that all row sums, all column sums, and the two diagonal-sums 
    	//must all be equal.
    	return false;
    }
    /**
     * Put Description here
     */
    public int[] maxAndMinElements( int[][] data )
    {
        // declare the max and the min
        int max = data[0][0];
        int min = data[0][0];

        // compute the sum
        

       
        

        int[] result = { max, min };
        return result;
    }


    /**
     * Put Description here
     */
    public int[] largestElements( int[][] data )
    {
        // declare the largest in row array
        int[] largestInRow = new int[data.length];

        // find the largest element in each row
 

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
