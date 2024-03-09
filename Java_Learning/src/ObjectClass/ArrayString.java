package ObjectClass;

public class ArrayString {
	public static void main(String[] args) {
		int[] a = { 12, 13, 14 };
		String s = "sabuj";
		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.println(a[i]);
				System.out.println(s.charAt(i));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("null");
		}

	}
}
