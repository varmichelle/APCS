import java.util.ArrayList;

public class InsertionSort {

	public void insertionSort(ArrayList<Comparable> list) {
		for (int i = 1; i < list.size(); i++) {
			Comparable val = list.get(i);
			for (int j = 0; j < i; j++) {
				if (val.compareTo(list.get(j)) < 0) {
					list.remove(i);
					list.add(j, val);
					break;
				}
			}
			System.out.print("After " + i + " outer loop(s): ");
			printArray(list);
		}
	}

	public void printArray(ArrayList<Comparable> list) {
		int n = list.size();
		for (int index = 0; index < n; index++)
			System.out.print(list.get(index) + " ");

		System.out.println();
	}
}