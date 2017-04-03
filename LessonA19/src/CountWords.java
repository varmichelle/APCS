/**
 * 
 * Class CountWords - determines statistics in text
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;
import java.io.*;

public class CountWords {

	private ArrayList<Word> words = new ArrayList<Word>();
	
	/**
	 * Constructor to initialize CountWords class with filename
	 * @param fName - name of file to load data from
	 */
	public CountWords(String fName) {
		loadFile(fName);
	}
	
	/**
	 * Load words from file
	 * @param fName - name of file to load data from
	 */
	public void loadFile(String fName) {
		System.out.println("File: " + fName);
		try {
			Scanner in = new Scanner(new File(fName));
			while (in.hasNext()) {
				String word = in.next().toLowerCase();
				for (int i = 0; i < word.length(); i++) {
					char letter = word.charAt(i);
					if (!((letter <= 'z' && letter >= 'a') || letter == '-' || letter == '\'')) {
						String copy = word.substring(0, i);
						if (i != word.length() - 1) copy += word.substring(i+1);
						word = copy;
					}
				}
				if (word.length() == 0) continue;
				if (word.equals("-")) continue;
				int index = word.indexOf("\"");
				if (index >= 0) {
					String copy = word.substring(0,index);
					if (index < word.length() - 1) copy += word.substring(index + 1);
					word = copy;
				}
				int indexOfWord = bsearch(word,0,words.size()-1);
				if (indexOfWord != -1) words.get(indexOfWord).incrementCount();
				else words.add(new Word(word));
				insertionSortByAlphabetical();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + fName + " (No such file or directory)");
		}
	}
	
	/**
	 * Print stats (# of unique words, total # of words, top 30 occuring words)
	 */
	public void printStats() {
		insertionSortByCount();
		System.out.println("Total number of unique words used in the file: " + words.size());
		int count = 0;
		for (Word w : words) {
			count += w.getCount();
		}
		System.out.println("Total number of words in file: " + count);
		System.out.println("Top 30 words are:");
		for (int i = 1; i < words.size(); i++) {
			Word val = words.get(i);
			for (int j = 0; j < i; j++) {
				if (val.compareTo(words.get(j)) < 0) {
					words.remove(i);
					words.add(j, val);
					break;
				}
			}
		}
		for (int i = 0; i < words.size() && i < 30; i++) {
			System.out.printf("%-5d", i);
			System.out.printf("%-5d", words.get(i).getCount());
			System.out.printf("%10s\n", words.get(i).getString());
		}
	}
	
	/** 
	* Searches the specified ArrayList for the specified word using recursive binary search 
	* @param word - word being searched for
	* @param first - Starting index of search range 
	* @param last - Ending index of search range 
	* @return index of Item if found, -1 if not found 
	*/ 
	private int bsearch(String word, int first, int last){ 
		if (first > last) return -1;
		int mid = (first + last) / 2;
		String currentWord = words.get(mid).getString();
		if (currentWord.equals(word)) return mid;
		else if (currentWord.compareTo(word) < 0) return bsearch(word, mid + 1, last);
		else if (currentWord.compareTo(word) > 0) return bsearch(word, first, mid - 1);
	    return -1;
	}
	
	/**
	 * Uses insertion sort to sort the word list by count
	 */
	public void insertionSortByCount() {
		for (int i = 1; i < words.size(); i++) {
			Word val = words.get(i);
			for (int j = 0; j < i; j++) {
				if (val.compareTo(words.get(j)) < 0) {
					words.remove(i);
					words.add(j, val);
					break;
				}
			}
		}
	}
	
	/**
	 * Uses insertion sort to sort the word list by alphabetical order
	 */
	public void insertionSortByAlphabetical() {
		for (int i = 1; i < words.size(); i++) {
			Word word = words.get(i);
			String w = word.getString();
			for (int j = 0; j < i; j++) {
				if (w.compareTo(words.get(j).getString()) < 0) {
					words.remove(i);
					words.add(j, word);
					break;
				}
			}
		}
	}
	
}
