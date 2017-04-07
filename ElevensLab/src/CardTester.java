import java.util.ArrayList;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add(new Card("7", "Hearts", 10));
		cards.add(new Card("Queen", "Diamonds", 100));
		cards.add(new Card("9", "Spades", 1));
		Card compareWith = new Card("7", "Hearts", 10);
		for (Card c : cards) {
			System.out.println("Get rank: " + c.rank());
			System.out.println("Get suit: " + c.suit());
			System.out.println("Get point value: " + c.pointValue());
			System.out.println("To string: " + c.toString());
			System.out.println("Matches 7 of hearts: " + c.matches(compareWith));
			System.out.println();
		}
	}
}
