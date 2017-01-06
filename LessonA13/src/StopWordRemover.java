/**
 * Class RemoveStopWords to remove specified words from text file
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;
import java.io.*;

public class StopWordRemover {

	String stopList = "a an the for of at on in to her she him his he her's and with was is";
	String inFile, outFile;
	int maxLineLength;
	
	/**
	 * Constructor to initialize file names and max line length
	 * @param inFile - name of input file
	 * @param outFile - name of output file
	 * @param maxLineLength - max number of characters in a line
	 * @param stopList - stop words list
	 */
	public StopWordRemover(String inFile, String outFile, int maxLineLength) {
		this.inFile = inFile;
		this.outFile = outFile;
		this.maxLineLength = maxLineLength;
	}
	
	/**
	 * Removes stop words from input file into output file
	 * Each line of output is not more than max characters long
	 * @return numRemoved - number of words removed
	 */
	public int removeStopWords() {
		try {
			int numRemoved = 0;
			Scanner in = new Scanner(new File(inFile));
			FileWriter out = new FileWriter(new File(outFile));
			int charsInLine = 0;
			out.write(maxLineLength + "\n");
			if (!in.hasNext()) System.out.println("Error: " + inFile + " is empty");
			while (in.hasNext()) {
				String word = in.next();
				String lowerCase = word.toLowerCase();
				String copy = stopList;
				boolean works = false;
				// check if word needs to be removed
				while (copy.contains(lowerCase)) {
					// make sure it's the whole word that matches 
					int start = copy.indexOf(lowerCase);
					if (start == 0 || copy.charAt(start - 1) == ' ') {
						int finish = start + lowerCase.length() - 1;
						if (finish == copy.length() - 1 || copy.charAt(finish + 1) == ' ') {
							works = true;
							numRemoved++;
						}
					}
					copy = copy.substring(start + 1);
				}
				if (!works) {
					// check if enough room to print on current line
					if (charsInLine + word.length() + 1 <= maxLineLength) {
						if (charsInLine > 0) out.write(" ");
						out.write(word);
						charsInLine += word.length() + 1;
					} else {
						out.write("\n" + word);
						charsInLine = word.length();
					}
				}
			}
			out.close();
			return numRemoved;
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error: " + inFile + " (No such file or directory)");
		} 
		catch (IOException e) {}
		return 0;
	}
}
