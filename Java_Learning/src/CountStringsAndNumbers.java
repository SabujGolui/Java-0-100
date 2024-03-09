public class CountStringsAndNumbers {

	public static void countStringsAndNumbers(String[] A) {
		int numStrings = 0;
		int numNumbers = 0;

		for (String element : A) {
			try {
				Integer.parseInt(element); // Attempt to parse as an integer
				numNumbers++;
			} catch (NumberFormatException e) {
				// Not a valid integer, treat it as a string
				numStrings++;
			}
		}

		System.out.println("Number of strings: " + numStrings);
		System.out.println("Number of numbers: " + numNumbers);
	}

	public static void main(String[] args) {
		String A[] = { "cat", "123", "dog", "456", "tac", "789" };
		countStringsAndNumbers(A);
	}
}