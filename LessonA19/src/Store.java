/**
 * 
 * Class Store - stores items and related info
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;
import java.io.*;

public class Store {

	private ArrayList<Item> myStore = new ArrayList<Item>();
	
	/**
	 * Default constructor to call loadFile with file50.txt
	 */
	public Store() {
		loadFile("file50.txt");
	}
	
	/**
	 * Constructor to load given file
	 * @param fName - file to load and read input from
	 */
	public Store(String fName) {
		loadFile(fName);
	}
	
	/**
	 * Load file and populate myStore with input, then sort by ID
	 * @param fName - file to load and read input from
	 */
	public void loadFile(String fName) {
		try {
			Scanner in = new Scanner(new File(fName));
			while (in.hasNext()) {
				myStore.add(new Item(in.nextInt(), in.nextInt()));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * Wrapper method to sort the arraylist by calling mergeSort
	 */
	public void sort() {
		mergeSort(myStore, 0, myStore.size() - 1);
	}
	
	/**
	 * Return data in string format
	 * @return data in string format
	 */
	public String toString() {
		String s = "";
		s += String.format("%10s", "Id");
		s += String.format("%10s\n\n", "Inv");
		for (int i = 0; i < myStore.size(); i++) {
			s += String.format("%2d", i+1);
			s += myStore.get(i) + "\n";
			if ((i+1) % 10 == 0) s += "\n";
		}
		return s;
	}
	
	/**
	 * Display the store in a nice table
	 */
	public void displayStore() {
		System.out.println(toString());
	}
	
	/**
	 * Helper method for mergesort, merges two arrays together
	 * @param a - arraylist to merge from
	 * @param first - index of first item to merge
	 * @param mid - index of middle item to merge
	 * @param last - index of last item to merge
	 */
	private void merge(ArrayList<Item> a, int first, int mid, int last) {
		int numElementsAdded = 0;
		ArrayList<Item> a1 = new ArrayList<Item>();
		for (int i = first; i <= mid; i++) {
			a1.add(a.get(first));
			a.remove(first);
		}
		ArrayList<Item> a2 = new ArrayList<Item>();
		for (int i = mid + 1; i <= last; i++) {
			a2.add(a.get(first));
			a.remove(first);
		}
		while (a1.size() > 0 && a2.size() > 0) {
			if (a1.get(0).compareTo(a2.get(0)) > 0) {
				a.add(first + numElementsAdded, a2.get(0));
				a2.remove(0);
				numElementsAdded++;
			} else {
				a.add(first + numElementsAdded, a1.get(0));
				a1.remove(0);
				numElementsAdded++;
			}
		}
		while (a1.size() > 0) {
			a.add(first + numElementsAdded, a1.get(0));
			a1.remove(0);
			numElementsAdded++;
		}
		while (a2.size() > 0) {
			a.add(first + numElementsAdded, a2.get(0));
			a2.remove(0);
			numElementsAdded++;
		}
	}

	/**
	 * Mergesorts the arraylist myStore
	 * @param a - arraylist to sort
	 * @param first - index of first item to mergesort
	 * @param last - index of last item to mergesort
	 */
	public void mergeSort(ArrayList<Item> a, int first, int last) {
		if (last - first < 1) return;
		mergeSort(a, first, (first + last)/2);
		mergeSort(a, (first + last)/2 + 1, last);
		merge(a, first, (first + last)/2, last);
	}
	
}
