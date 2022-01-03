

import java.util.Arrays;
public class MiniLesson {
	public static void main(String[] args) {
		int[] frq1 = new int [] {10, 99999, 25, 32, 65, 32, 5};
		int[] frq2 = new int [] {99999, 25, 32, 32, 65, 5, 10};
		Arrays.sort(frq1);
		Arrays.sort(frq2);
		if (Arrays.equals(frq1, frq2)) {
			System.out.println("Both arrays are equal.");
		} else {
			System.out.println("Both arrays are not equal.");
		}
	}
}


