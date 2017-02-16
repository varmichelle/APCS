/**
 * @author Michelle Li
 * @period #1
 * Class Life - simulates 5 generations of a game of life
 */

import java.io.*;
import java.util.*;

public class Life {
	
	// instance variables
	private char[][] grid;
	private static final int[] dx = {-1,0,1,1,1,0,-1,-1};
	private static final int[] dy = {-1,-1,-1,0,1,1,1,0};
	
	/** constructor
	 * reads in the data from the given file and sets up the 
	 * life matrix
	 * @param fname - name of file
	 * @throws FileNotFoundException 
	 */
	public Life(String fname) throws FileNotFoundException {
		grid = new char[20][20];
		Scanner in = new Scanner(new File(fname));
		int N = in.nextInt();
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				grid[i][j] = ' ';
			}
		}
		for (int i = 0; i < N; i++) {
			int row = in.nextInt();
			int col = in.nextInt();
			grid[row][col] = '*';
		}
	}
	
	/**
	 * Method to print the life matrix
	 */
	public void printMatrix() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Method to count the number of neighbors of the given cell
	 * in the life matrix
	 * @param row - row number
	 * @param col - column number
	 * @return - number of neighbors of the given cell
	 */
	public int numberOfNeighbors(int row, int col) {
		int count = 0;
		for (int i = 0; i < 8; i++) {
			int newRow = row + dy[i];
			int newCol = col + dx[i];
			if (newRow >= 0 && newRow < 20 && newCol >= 0 && newCol < 20) {
				if (grid[newRow][newCol] == '*') count++;
			}
		}
		return count;
		
	}
	
	/**
	 * Method to determine if given cell is empty
	 * @param row - cell row number
	 * @param col - cell column number
	 * @return true if it is empty, false otherwise
	 */
	private boolean isEmpty(int row, int col) {
		if (grid[row][col] == ' ') return true;
		else return false;
	}
	
	/** 
	 * Method that simulates the game of life
	 */
	public void generation() {
		//Your code goes here

	}
	
	/**
	 * Method to print the statistics
	 */
	public void printStatistics() {
		int rowCount = 0;
		for (int i = 0; i < 20; i++) {
			if (!isEmpty(10,i)) rowCount++;
		}
		System.out.println("Number in Row 10 ---> " + rowCount + "\n");
		int colCount = 0;
		for (int i = 0; i < 20; i++) {
			if (!isEmpty(i,20)) colCount++;
		}
		System.out.println("Number in Column 10 ---> " + colCount + "\n");
		int totalCount = 0;
		for (int row = 0; row < 20; row++) {
			for (int col = 0; col < 20; col++) {
				if (!isEmpty(row, col)) totalCount++;
			}
		}
		System.out.println("Number of living organisms ---> " + totalCount + "\n");
	}
}
