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
	 */
	public Life(String fname) {
		grid = new char[20][20];
		try {
			Scanner in = new Scanner(new File(fname));
			int N = in.nextInt();
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {
					grid[i][j] = ' ';
				}
			}
			for (int i = 0; i < N; i++) {
				int row = in.nextInt()-1;
				int col = in.nextInt()-1;
				grid[row][col] = '*';
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Method to print the life matrix
	 */
	public void printMatrix() {
		System.out.println("      12345678901234567890\n");
		for (int i = 0; i < 20; i++) {
			System.out.printf("%-7s", i+1);
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
	public int numberOfNeighbors(char[][] copy, int row, int col) {
		int count = 0;
		for (int i = 0; i < 8; i++) {
			int newRow = row + dy[i];
			int newCol = col + dx[i];
			if (newRow >= 0 && newRow < 20 && newCol >= 0 && newCol < 20) {
				if (copy[newRow][newCol] == '*') count++;
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
	private boolean isEmpty(char[][] copy, int row, int col) {
		if (copy[row][col] == ' ') return true;
		else return false;
	}
	
	/** 
	 * Method that simulates the game of life
	 */
	public void generation() {
		char[][] copy = new char[20][20];
		for (int row = 0; row < 20; row++) {
			for (int col = 0; col < 20; col++) {
				copy[row][col] = grid[row][col];
			}
		}
		for (int row = 0; row < 20; row++) {
			for (int col = 0; col < 20; col++) {
				int numNeighbors = numberOfNeighbors(copy,row,col);
				if (numNeighbors == 3 && isEmpty(copy,row,col)) grid[row][col] = '*';
				if (numNeighbors < 2 || numNeighbors > 3) grid[row][col] = ' ';
			}
		}
	}
	
	/**
	 * Method to print the statistics
	 */
	public void printStatistics() {
		int rowCount = 0;
		for (int i = 0; i < 20; i++) {
			if (!isEmpty(grid,9,i)) rowCount++;
		}
		System.out.println("Number in Row 10 ---> " + rowCount);
		int colCount = 0;
		for (int i = 0; i < 20; i++) {
			if (!isEmpty(grid,i,9)) colCount++;
		}
		System.out.println("Number in Column 10 ---> " + colCount);
		int totalCount = 0;
		for (int row = 0; row < 20; row++) {
			for (int col = 0; col < 20; col++) {
				if (!isEmpty(grid,row, col)) totalCount++;
			}
		}
		System.out.println("Number of living organisms ---> " + totalCount);
	}
}
