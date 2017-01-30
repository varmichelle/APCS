/**
 * Class TokenPass - simulates a token passing game
 * @author Michelle Li
 * @period 1
 *
 */

import java.util.*;

public class TokenPass {
	// Declare the instance variables
	private int[] board;
	private int currentPlayer;
	
	/**
	 * Prints the current board 
	 * in the following format [#, #, # ...]
	 */
	private void printCurrentBoard() {
		System.out.print("[");
		for (int i = 0; i < board.length; i++) {
			if (i != board.length - 1) System.out.print(board[i] + ", ");
			else System.out.println(board[i] + "]");
		}
	}
	
	/**
	 * Creates the board array to be of size playerCount and fills it with
	 * random integer values from 1 to 10, inclusive. Initializes currentPlayer
	 * to a random integer value in the range between 0 and playerCount-1,
	 * inclusive. The method also prints the player count, current player, and 
	 * the initial board
	 * 
	 * @param playerCount
	 *            the number of players
	 * @param seed
	 * 			  the seed for the random number generator
	 */
	public TokenPass(int playerCount, int seed) {
		board = new int[playerCount];
		Random rng = new Random(seed);
		for (int i = 0; i < playerCount; i++) {
			board[i] = rng.nextInt(10) + 1;
		}
		currentPlayer = rng.nextInt(playerCount);
		System.out.println("Player Count = " + playerCount);
		System.out.println("Current Player = " + currentPlayer);
		System.out.print("Initial Board: ");
		printCurrentBoard();
	}

	/**
	 * Distributes the tokens from the current player's position one at a time
	 * to each player in the game. Distribution begins with the next position
	 * and continues until all the tokens have been distributed. If there are
	 * still tokens to distribute when the player at the highest position is
	 * reached, the next token will be distributed to the player at position 0.
	 * The method also prints the board after the tokens are distributed.
	 * Precondition: the current player has at least one token. 
	 * Postcondition: the current player has not changed.
	 */
	public void distributeCurrentPlayerTokens() {
		int tokens = board[currentPlayer];
		for (int count = 1; count <= tokens; count++) {
			board[(currentPlayer + count) % board.length]++;
			board[currentPlayer]--;
		}
		System.out.print("After Distributing Tokens: ");
		printCurrentBoard();	
	}

}
