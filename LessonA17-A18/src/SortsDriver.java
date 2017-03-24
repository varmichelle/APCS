import java.util.*;
public class SortsDriver {

	public static void main(String[] args) {
		
		int[] sizes = {100,200,400,800};
		Random rng = new Random();
		Sorts s = new Sorts();
		for (int i = 0; i < 4; i++) {
			ArrayList<Comparable> a = new ArrayList<Comparable>();
			for (int j = 1; j <= sizes[i]; j++) {
				a.add(rng.nextInt(1000));
			}
			s.insertionSort(a);
			System.out.println(sizes[i] + " " + s.getStepCount());
		}

	}

}
