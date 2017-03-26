/**
 * 
 * Class Word - simulates a word
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;

public class Word {

	private String word;
	private int count;
	
	/**
	 * Default constructor to initialize word to empty string and count to 0
	 */
	public Word() {
		word = "";
		count = 0;
	}
	
	/**
	 * Constructor to initialize word to parameter and count to 1
	 * @param w - word
	 */
	public Word(String w) {
		word = w;
		count = 1;
	}
	
	/**
	 * Return word
	 * @return word - word stored
	 */
	public String getString() {
		return word;
	}
	
	/**
	 * Return number of instances of the word
	 * @return count - number of instances
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * Set word to parameter
	 * @param s - word to change to
	 */
	public void setWord(String s) {
		word = s;
	}
	
	/**
	 * Increment word count by 1
	 */
	public void incrementCount() {
		count++;
	}
	
	/**
	 * Decrement word count by 1
	 */
	public void decrementCount() {
		count--;
	}
	
	/**
	 * Comparison function
	 * @param w - other word to compare to
	 * @return other word count minus this word count (sort in descending order by # of instances)
	 */
	public int compareTo(Word w) {
		return w.getCount() - count;
	}
	
}
