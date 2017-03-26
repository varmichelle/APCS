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
				boolean wordExists = false;
				for (int i = 0; i < words.size(); i++) {
					if (words.get(i).getString().equals(word)) {
						words.get(i).incrementCount();
						wordExists = true;
					} 
					if (!wordExists && words.get(i).getString().compareTo(word) > 0) {
						words.add(i, new Word(word));
						wordExists = true;
					}
				}
				if (!wordExists) words.add(new Word(word));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + fName + " (No such file or directory)");
		}
	}
	
	/**
	 * Print stats (# of unique words, total # of words, top 30 occuring words)
	 */
	public void printStats() {
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
	
}
