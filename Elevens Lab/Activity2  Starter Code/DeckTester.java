/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

		// First Deck Instance
		String[] ranks1 = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits1 = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int[] values1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck deck1 = new Deck(ranks1, suits1, values1);
		System.out.println("Deck 1 size: " + deck1.size());
		System.out.println("Deck 1 is empty: " + deck1.isEmpty());
		System.out.println("Deck 1 deal: " + deck1.deal());

		// Second Deck Instance
		String[] ranks2 = {"Nerd", "Geek", "Lame", "Awesome", "CoolKid"};
		String[] suits2 = {"Boy", "Girl", "Male", "Female"};
		int[] values2 = {1, 2, 3, 4, 5};
		Deck deck2 = new Deck(ranks2, suits2, values2);
		System.out.println("Deck 2 size: " + deck2.size());
		System.out.println("Deck 2 is empty: " + deck2.isEmpty());
		System.out.println("Deck 2 deal: " + deck2.deal());

		// Deck Instance 3
		String[] ranks3 = {"Noob", "Trash", "Loser", "Winner", "Addicted"};
		String[] suits3 = {"Man1", "Man2", "Woman1", "Woman2"};
		int[] values3 = {1, 2, 3, 4, 5};
		Deck deck3 = new Deck(ranks3, suits3, values3);
		System.out.println("Deck 3 size: " + deck3.size());
		System.out.println("Deck 2 is empty: " + deck2.isEmpty());
		System.out.println("Deck 3 deal: " + deck3.deal());
	}
}
