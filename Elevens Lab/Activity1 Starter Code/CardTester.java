/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card Test1 = new Card("King", "Hearts", 10);
		Card Test2 = new Card("Queen", "Spades", 10);
		Card Test3 = new Card("King", "Hearts", 10);
		System.out.println(Test1);
		System.out.println("Rank: " + Test1.rank());
		System.out.println("Suit: " + Test1.suit());
		System.out.println("Point Value: " + Test1.pointValue());
		System.out.println(Test2);
		System.out.println("Rank: " + Test2.rank());
		System.out.println("Suit: " + Test2.suit());
		System.out.println("Point Value: " + Test2.pointValue());
		System.out.println(Test3);
		System.out.println("Rank: " + Test3.rank());
		System.out.println("Suit: " + Test3.suit());
		System.out.println("Point Value: " + Test3.pointValue());
		System.out.println("Test1.matches(Test2) = " + Test1.matches(Test2));
		System.out.println("Test1.matches(Test3) = " + Test1.matches(Test3));
		System.out.println("Test2.matches(Test3) = " + Test2.matches(Test3));
	}
}
