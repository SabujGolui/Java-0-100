package Intermediate;

import java.io.IOException;
import java.util.Scanner;

class Result {
	public static String appendAndDelete(String s, String t, int k) {
		String res = "No";
		int commonLength = 0;
		for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
			if (s.charAt(i) == t.charAt(i)) {
				commonLength++;
			} else {
				break;
			}
		}

		int totalOperations = s.length() - commonLength + (t.length() - commonLength);

		if (totalOperations <= k && (k - totalOperations) % 2 == 0 || s.length() + t.length() <= k) {
			res = "Yes";
		}

		return res;
	}
}

public class Append_Delete {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter string s: ");
		String s = scanner.nextLine();

		System.out.print("Enter string t: ");
		String t = scanner.nextLine();

		System.out.print("Enter integer k: ");
		int k = scanner.nextInt();

		String result = Result.appendAndDelete(s, t, k);

		System.out.println(result);

		scanner.close();
	}
}
