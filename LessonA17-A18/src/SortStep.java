import java.util.*;

/**
 * Driver program for the Sorts class.
 *
 * modified by Jason Quesenberry and Nancy Quesenberry January 16, 2006
 *
 */
public class SortStep {
	private Scanner console;
	private ArrayList<Comparable> myArray;
	private Sorts mySorts;
	private String listType;

	/**
	 * Constructor for the SortStep object
	 */
	public SortStep() {
		console = new Scanner(System.in);
		mySorts = new Sorts();
		myArray = null;
		listType = "Integer";
	}

	/**
	 * Asks the user to select a sorting algorithm, fills the array with an
	 * amount of random integer data chosen by the user, calls the sorting
	 * algorithm, and gives an option of printing out the data after it has been
	 * sorted.
	 */
	public void sortMenu() {
		String choice;
		String print;

		do {
			System.out.println();
			System.out.println("Sorting algorithm menu");
			System.out.println();
			System.out.println("(1) Bubble sort");
			System.out.println("(2) Selection sort");
			System.out.println("(3) Insertion sort");
			System.out.println("(4) Recursive mergesort");
			System.out.println("(5) Quick sort");
			System.out.println("(6) Fill with Integers");
			System.out.println("(7) Fill with Strings");
			System.out.println("(Q) Quit");
			System.out.println();
			System.out.print("Choice ---> ");
			choice = console.next() + " ";
			System.out.println("choice = " + choice);
			if ('1' <= choice.charAt(0) && choice.charAt(0) <= '7') {
				System.out.println();

				mySorts.setStepCount(0);

				switch (choice.charAt(0)) {
				case '1':
					resetArray();
					mySorts.bubbleSort(myArray);
					break;
				case '2':
					resetArray();
					mySorts.selectionSort(myArray);
					break;
				case '3':
					resetArray();
					mySorts.insertionSort(myArray);
					break;
				case '4':
					resetArray();
					int last = myArray.size() - 1;
					mySorts.mergeSort(myArray, 0, last);
					break;
				case '5':
					resetArray();
					int end = myArray.size() - 1;
					mySorts.quickSort(myArray, 0, end);
					break;
				case '6':
					listType = "Integer";
					break;
				case '7':
					listType = "String";
					break;

				}
				System.out.println("listType = " + listType);
				if ('1' <= choice.charAt(0) && choice.charAt(0) <= '5') {
					System.out.println();
					System.out.println("Array sorted to:");
					screenOutput();
					System.out.println();
					System.out.println("# steps = " + mySorts.getStepCount());
					System.out.println();
				}
			}
		} while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
	}

	/**
	 * Initializes myArray with random integers in the range 1..largestInt
	 *
	 * @param numInts
	 *            number of integers to generate (size of myArray)
	 * @param largestInt
	 *            largest possible random integer to create
	 */
	private void fillArrayWithInts() {

		System.out.print("How many numbers do you wish to generate? ");
		int numInts = console.nextInt();
		System.out.print("Largest integer to generate? ");
		int largestInt = console.nextInt();

		Random randGen = new Random(234);
		myArray = new ArrayList<Comparable>();

		for (int loop = 0; loop < numInts; loop++) {
			Integer x = new Integer(randGen.nextInt(largestInt) + 1);
			myArray.add(x);
		}
	}

	/**
	 * Initializes myArray with a few hard-coded Strings
	 *
	 * @param numInts
	 *            number of integers to generate (size of myArray)
	 * @param largestInt
	 *            largest possible random integer to create
	 */
	private void fillArrayWithStrings() {
		myArray = new ArrayList<Comparable>();
		myArray.add("eat");
		myArray.add("steaks");
		myArray.add("juicy");
		myArray.add("huge");
		myArray.add("dogs");
		myArray.add("big");
	}

	/**
	 * reset the array for the next sort
	 */
	private void resetArray() {
		System.out.println("ResetArray - listType = " + listType);
		if (listType.equals("Integer")) {
			fillArrayWithInts();
		} else if (listType.equals("String")) {
			fillArrayWithStrings();
		}
		System.out.println();
		System.out.println("Array reset to:");
		screenOutput();
	}

	/**
	 * prints out the contents of the array in tabular form, 12 columns
	 */
	private void screenOutput() {
		for (int loop = 0; loop < myArray.size(); loop++) {
			if (loop % 12 == 0) {
				System.out.println();
			}
			System.out.print(myArray.get(loop) + "  ");
		}
		System.out.println();
	}

}