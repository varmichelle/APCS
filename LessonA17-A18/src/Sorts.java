import java.util.*;

/**
 * Class Sorts - Various sorting algorithms
 *
 * @author Michelle Li
 * @period 1
 */

public class Sorts {

	private long steps;

	/**
	 * Initialize number of steps to 0
	 * 
	 * @param list
	 *            Description of Parameter
	 */
	public Sorts() {
		steps = 0;
	}

	/**
	 * Description of the Method
	 *
	 * @param list
	 *            reference to an array of integers to be sorted
	 */
	public void bubbleSort(ArrayList<Comparable> list) {
		// Add your code here
		System.out.println();
		System.out.println("Bubble Sort");
		System.out.println();
	}

	/**
	 * Description of the Method
	 *
	 * @param list
	 *            reference to an array of integers to be sorted
	 */
	public void selectionSort(ArrayList<Comparable> list) {
		// Add your code here
		System.out.println();
		System.out.println("Selection Sort");
		System.out.println();
	}

	/**
	 * Description of the Method
	 *
	 * @param list
	 *            reference to an array of integers to be sorted
	 */
	public void insertionSort(ArrayList<Comparable> list) {
		// Add your code here
		System.out.println();
		System.out.println("Insertion Sort");
		System.out.println();
	}

	/**
	 * Takes in entire vector, but will merge the following sections together:
	 * Left sublist from a[first]..a[mid], right sublist from a[mid+1]..a[last].
	 * Precondition: each sublist is already in ascending order
	 *
	 * @param a
	 *            reference to an array of integers to be sorted
	 * @param first
	 *            starting index of range of values to be sorted
	 * @param mid
	 *            midpoint index of range of values to be sorted
	 * @param last
	 *            last index of range of values to be sorted
	 */
	private void merge(ArrayList<Comparable> a, int first, int mid, int last) {
		// Add your code here

	}

	/**
	 * Recursive mergesort of an array of integers
	 *
	 * @param a
	 *            reference to an array of integers to be sorted
	 * @param first
	 *            starting index of range of values to be sorted
	 * @param last
	 *            ending index of range of values to be sorted
	 */
	public void mergeSort(ArrayList<Comparable> a, int first, int last) {
		// Add your code here

	}

	/**
	 * Description of the Method
	 * 
	 * @param a
	 *            reference to an array of integers to be sorted
	 * @param first
	 *            starting index of range of values to be sorted
	 * @param last
	 *            ending index of range of values to be sorted
	 */
	public void quickSort(ArrayList<Comparable> a, int first, int last) {
		// Add your code here

	}

	/**
	 * Accessor method to return the current value of steps
	 *
	 */
	public long getStepCount() {
		return steps;
	}

	/**
	 * Modifier method to set or reset the step count. Usually called prior to
	 * invocation of a sort method.
	 *
	 * @param stepCount
	 *            value assigned to steps
	 */
	public void setStepCount(long stepCount) {
		steps = stepCount;
	}

	/**
	 * Interchanges two elements in an ArrayList
	 *
	 * @param list
	 *            reference to an array of integers
	 * @param a
	 *            index of integer to be swapped
	 * @param b
	 *            index of integer to be swapped
	 */
	public void swap(ArrayList<Comparable> list, int a, int b) {
		// replace these lines with your code
	}
}
