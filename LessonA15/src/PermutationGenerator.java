/**
 * Class PermutationGenerator - generates random permutations of the numbers 1-10
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;

public class PermutationGenerator {
	
	private final Random rand;
	private ArrayList<Integer> numbers, permutation;

	/**
	 * Initializes random number generator with input seed
	 * @param seed - seed for RNG
	 */
	public PermutationGenerator(int seed) {
		rand = new Random(seed);
	}
	
	/**
	 * Generates a random permutation of the numbers 1-10
	 * @return permutation arrayList
	 */
	public ArrayList<Integer> nextPermutation() {
		numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		permutation = new ArrayList<Integer>();
		for (int i = 10; i >= 1; i--) {
			int randomIndex = rand.nextInt(i);
			int number = numbers.get(randomIndex);
			numbers.remove(randomIndex);
			permutation.add(number);
		}
		return permutation;
	}
	
	/**
	 * Returns the data of the permutation generator in string format
	 * @return toString data
	 */
	public String toString() {
		return permutation.toString();
	}
	
}
