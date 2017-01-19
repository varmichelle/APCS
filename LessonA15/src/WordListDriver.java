
public class WordListDriver {

	public static void main(String[] args) {
		WordList animals = new WordList();
		animals.add("cat");
		animals.add("mouse");
		animals.add("elephant");
		animals.add("frog");
		animals.add("dog");
		animals.add("dog");
		animals.add("rhinoceros");
		animals.add("ox");
		animals.add("dog");
		System.out.println("Initial list: " + animals);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Words of length " + i + ": " + animals.numWordsOfLength(i));
		}
		animals.removeWordsOfLength(10);
		System.out.println("List after removing words of length 10: " + animals);
	}

}
