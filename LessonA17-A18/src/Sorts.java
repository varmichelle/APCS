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
			for (int j = 0; j < list.size() - i - 1; j++) {
				// 2 gets and 1 compare
				steps += 3;
				// steps for swap are incremented in the swap method
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
				// 2 gets and 1 compare
				steps += 3;
				if (list.get(j).compareTo(list.get(min)) < 0) min = j;
			}
			// steps incremented in swap method
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
			// 2 gets and 1 compare
			steps += 3;
			Comparable val = list.get(i);
			for (int j = 0; j < i; j++) {
				if (val.compareTo(list.get(j)) < 0) {
					// 1 add and 1 remove
					steps += 2;
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
		int numElementsAdded = 0;
		ArrayList<Comparable> a1 = new ArrayList<Comparable>();
		for (int i = first; i <= mid; i++) {
			// 1 add, 1 get, 1 remove
			steps += 3;
			a1.add(a.get(first));
			a.remove(first);
		}
		ArrayList<Comparable> a2 = new ArrayList<Comparable>();
		for (int i = mid + 1; i <= last; i++) {
			// 1 add, 1 get, 1 remove
			steps += 3;
			a2.add(a.get(first));
			a.remove(first);
		}
		while (a1.size() > 0 && a2.size() > 0) {
			// 2 gets, 1 compare
			steps += 3;
			if (a1.get(0).compareTo(a2.get(0)) > 0) {
				// 1 add, 1 get, 1 remove
				steps += 3;
				a.add(first + numElementsAdded, a2.get(0));
				a2.remove(0);
				numElementsAdded++;
			} else {
				// 1 add, 1 get, 1 remove
				steps += 3;
				a.add(first + numElementsAdded, a1.get(0));
				a1.remove(0);
				numElementsAdded++;
			}
		}
		while (a1.size() > 0) {
			// 1 add, 1 get, 1 remove
			steps += 3;
			a.add(first + numElementsAdded, a1.get(0));
			a1.remove(0);
			numElementsAdded++;
		}
		while (a2.size() > 0) {
			// 1 add, 1 get, 1 remove
			steps += 3;
			a.add(first + numElementsAdded, a2.get(0));
			a2.remove(0);
			numElementsAdded++;
		}
	}

	/**
	 * Recursive mergesort of an array of integers
	 * @param a - reference to an array of integers to be sorted
	 * @param first - starting index of range of values to be sorted
	 * @param last - ending index of range of values to be sorted
	 */
	public void mergeSort(ArrayList<Comparable> a, int first, int last) {
		if (last - first < 1) return;
		mergeSort(a, first, (first + last)/2);
		mergeSort(a, (first + last)/2 + 1, last);
		// steps included in merge method
		merge(a, first, (first + last)/2, last);
	}

	/**
	 * Recursive quicksort
	 * @param a - reference to an array of integers to be sorted
	 * @param first - starting index of range of values to be sorted
	 * @param last - ending index of range of values to be sorted
	 */
	public void quickSort(ArrayList<Comparable> a, int first, int last) {
		int i = first, j = last;
		// 1 get
		steps++;
		Comparable pivot = a.get((first + last) / 2);
		while (i <= j) {
			// 2 gets, 2 compares
			steps += 4;
			while (a.get(i).compareTo(pivot) < 0) i++;
			while (a.get(j).compareTo(pivot) > 0) j--;
			if (i <= j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}
		if (first < j) quickSort(a, first, j);
		if (i < last) quickSort(a, i, last);
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
		steps += 4;
		Comparable temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
	}
	
}
