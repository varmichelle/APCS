/**
 * Class Sorts - Various sorting algorithms
 * @author Michelle Li
 * @period 1
 */

import java.util.*;

public class Sorts {

	private long steps;

	/**
	 * Constructor to initialize number of steps to 0
	 */
	public Sorts() {
		steps = 0;
	}

	/**
	 * Perform bubble sort
	 * @param list - reference to an array of integers to be sorted
	 */
	public void bubbleSort(ArrayList<Comparable> list) {
		System.out.println();
		System.out.println("Bubble Sort");
		System.out.println();
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j).compareTo(list.get(j+1)) > 0) swap(list, j, j+1);
			}
		}
	}

	/**
	 * Perform selection sort
	 * @param list - reference to an array of integers to be sorted
	 */
	public void selectionSort(ArrayList<Comparable> list) {
		System.out.println();
		System.out.println("Selection Sort");
		System.out.println();
		for (int i = 0; i < list.size() - 1; i++) {
			int min = i;
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(j).compareTo(list.get(min)) < 0) min = j;
			}
			swap(list, min, i);
		}
	}

	/**
	 * Perform insertion sort
	 * @param list - reference to an array of integers to be sorted
	 */
	public void insertionSort(ArrayList<Comparable> list) {
		System.out.println();
		System.out.println("Insertion Sort");
		System.out.println();
		for (int i = 1; i < list.size(); i++) {
			Comparable val = list.get(i);
			for (int j = 1; j < i; j++) {
				if (val.compareTo(list.get(j)) < 0) {
					list.remove(i);
					list.add(j, val);
					break;
				}
			}
		}
	}

	/**
	 * Merge two sorted subarrays for mergesort
	 * Takes in entire vector, but will merge the following sections together:
	 * Left sublist from a[first]..a[mid], right sublist from a[mid+1]..a[last].
	 * Precondition: each sublist is already in ascending order
	 * @param a - reference to an array of integers to be sorted
	 * @param first - starting index of range of values to be sorted
	 * @param mid - midpoint index of range of values to be sorted
	 * @param last - last index of range of values to be sorted
	 */
	private void merge(ArrayList<Comparable> a, int first, int mid, int last) {
		
	}

	/**
	 * Recursive mergesort of an array of integers
	 * @param a - reference to an array of integers to be sorted
	 * @param first - starting index of range of values to be sorted
	 * @param last - ending index of range of values to be sorted
	 */
	public void mergeSort(ArrayList<Comparable> a, int first, int last) {

	}

	/**
	 * Recursive quicksort
	 * @param a - reference to an array of integers to be sorted
	 * @param first - starting index of range of values to be sorted
	 * @param last - ending index of range of values to be sorted
	 */
	public void quickSort(ArrayList<Comparable> a, int first, int last) {

	}

	/**
	 * Accessor method to return the current value of steps
	 */
	public long getStepCount() {
		return steps;
	}

	/**
	 * Modifier method to set or reset the step count. Usually called prior to
	 * invocation of a sort method.
	 * @param stepCount - value assigned to steps
	 */
	public void setStepCount(long stepCount) {
		steps = stepCount;
	}

	/**
	 * Interchanges two elements in an ArrayList
	 * @param list - reference to an array of integers
	 * @param a - index of integer to be swapped
	 * @param b - index of integer to be swapped
	 */
	public void swap(ArrayList<Comparable> list, int a, int b) {
		Comparable temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
	}
	
}
