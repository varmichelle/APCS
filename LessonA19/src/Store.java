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
	
	public Store() {
		
	}
	
	public Store(String fName) {
		loadFile(fName);
	}
	
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
	
	public void sort() {
		System.out.println(myStore.size());
		merge(myStore, 0, myStore.size()/2, myStore.size() - 1);
	}
	
	public String toString() {
		
	}
	
	public void displayStore() {
		
	}
	
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

	public void mergeSort(ArrayList<Item> a, int first, int last) {
		if (last - first < 1) return;
		mergeSort(a, first, (first + last)/2);
		mergeSort(a, (first + last)/2 + 1, last);
		merge(a, first, (first + last)/2, last);
	}
	
}
