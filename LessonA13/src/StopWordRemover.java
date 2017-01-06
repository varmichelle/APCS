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
	 * @throws FileNotFoundException 
	 */
	public int removeStopWords() throws Exception {
		try {
			int numRemoved = 0;
			Scanner in = new Scanner(new File(inFile));
			FileWriter out = new FileWriter(new File(outFile));
			int charsInLine = 0;
			while (in.hasNext()) {
				String fullWord = in.next();
				String strippedWord = "";
				for (int i = 0; i < fullWord.length(); i++) {
					// only add letters
					char letter = fullWord.charAt(i);
					if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
						strippedWord += letter;
					}
				}
				boolean works = false;
				// check if word needs to be removed
				if (stopList.contains(strippedWord)) {
					// make sure it's the whole word that matches 
					int start = stopList.indexOf(strippedWord);
					if (start == 0 || stopList.charAt(start - 1) == ' ') {
						int finish = start + strippedWord.length() - 1;
						if (finish == stopList.length() - 1 || stopList.charAt(finish + 1) == ' ') {
							works = true;
							// check if enough room to print on current line
							if (charsInLine + fullWord.length() + 1 <= maxLineLength) {
								if (charsInLine > 0) System.out.print(" ");
								out.write(fullWord);
								charsInLine += fullWord.length();
							} else {
								out.write("\n" + fullWord);
								charsInLine = fullWord.length();
							}
						}
					}
				}
				if (!works) numRemoved++;
			}
			out.close();
			return numRemoved;
		} 
		catch (FileNotFoundException e) {} 
		catch (IOException e) {}
		return 0;
	}
}
