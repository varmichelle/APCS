/**
 * Class RemoveStopWords to remove specified words from text file
 * @author Michelle Li
 * Period 1
 *
 */

public class RemoveStopWords {

	private String inFile, outFile, stopList;
	private int maxLineLength;
	
	/**
	 * Constructor to initialize file names and max line length
	 * @param inFile - name of input file
	 * @param outFile - name of output file
	 * @param maxLineLength - max number of characters in a line
	 * @param stopList - stop words list
	 */
	public RemoveStopWords(String inFile, String outFile, int maxLineLength, String stopList) {
		this.inFile = inFile;
		this.outFile = outFile;
		this.maxLineLength = maxLineLength;
		this.stopList = stopList;
	}
	
	/**
	 * Removes stop words from input file into output file
	 * @return numRemoved - number of words removed
	 */
	public int removeStopWords() {
		int numRemoved = 0;
	}
}
