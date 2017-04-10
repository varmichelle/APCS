import java.util.*;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 4;
	/**
	 * The seed for the Random number generator.
	 */
	private static final int SEED = 15;
	
	/**
	 * Random number generator
	 */
	private static Random rand = new Random(SEED);
	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Flipping a weighted coin 10 times");
		for (int i = 0; i < 10; i++)
			System.out.print(flip() + " ");
		System.out.println();
		System.out.println();
		int[] a = {1, 2, 3, 4};
		int[] b = {4, 3, 2, 1};
		System.out.print("Array a = {");
		for (int i = 0; i < a.length-1; i++)
			System.out.print(a[i] + ", ");
		System.out.println(a[a.length-1] + "}");
		System.out.print("Array b = {");
		for (int i = 0; i < b.length-1; i++)
			System.out.print(b[i] + ", ");
		System.out.println(b[b.length-1] + "}");
		System.out.println("Permutations: " + arePermutations(a, b));
		System.out.println();
		int[] c = {1, 2, 3, 4};
		int[] d = {4, 3, 2};
		System.out.print("Array c = {");
		for (int i = 0; i < c.length-1; i++)
			System.out.print(c[i] + ", ");
		System.out.println(c[c.length-1] + "}");
		System.out.print("Array d = {");
		for (int i = 0; i < d.length-1; i++)
			System.out.print(d[i] + ", ");
		System.out.println(d[d.length-1] + "}");
		System.out.println("Permutations: " + arePermutations(c, d));
		System.out.println();
		int[] e = {1, 2, 3, 5};
		int[] f = {4, 3, 2, 1};
		System.out.print("Array e = {");
		for (int i = 0; i < e.length-1; i++)
			System.out.print(e[i] + ", ");
		System.out.println(e[e.length-1] + "}");
		System.out.print("Array f = {");
		for (int i = 0; i < f.length-1; i++)
			System.out.print(f[i] + ", ");
		System.out.println(f[f.length-1] + "}");
		System.out.println("Permutations: " + arePermutations(e, f));
	}
	/**
	 * Flips a weighted coin
	 * The coin is twice as likely to turn up heads as tails.
	 */
	public static String flip()
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int flip = rand.nextInt(3);
		if (flip == 2) return "tails";
		else return "heads";
	}
	/**
	 * Returns true if one of the given arrays is a permutation of 
	 * the other
	 * @param a - first array 
	 * @param b - second array
	 * @return - true if the two arrays are permutations, false otherwise
	 * Precondition: a and b are arrays of the same length
	 */
	public static boolean arePermutations(int[] a, int[] b)
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		selectionSort(a);
		selectionSort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) return false;
		}
		return true;
	}
	
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int min = i;
			for (int j = i+1; j < list.length; j++) {
				if (list[j] < list[min]) min = j;
			}
			int temp = list[min];
			list[min] = list[i];
			list[i] = temp;
		}
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		int k = 0;
		for (int j = 0; j < values.length/2; j++) {
			shuffled[k] = values[j];
			k += 2;
		}
		k = 1;
		for (int j = values.length/2; j < values.length; j++) {
			shuffled[k] = values[j];
			k += 2;
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		for (int k = values.length - 1; k >= 1; k--) {
			int n = rand.nextInt(k+1);
			int temp = values[k];
			values[k] = values[n];
			values[n] = temp;
		}
	}
}
