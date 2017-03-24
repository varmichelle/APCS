import java.util.ArrayList;

public class InsertionSortDriver {
	public static void main(String[] args) {

		ArrayList<Comparable> arr = new ArrayList<Comparable>(8);
		arr.add(3);
		arr.add(8);
		arr.add(17);
		arr.add(5);
		arr.add(7);
		arr.add(12);
		arr.add(14);
		arr.add(9);

		InsertionSort sorter = new InsertionSort();
		System.out.print("Initial array: ");
		sorter.printArray(arr);
		sorter.insertionSort(arr);

	}
}
