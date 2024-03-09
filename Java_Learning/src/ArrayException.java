public class ArrayException {
	public static void main(String[] args) {
		int[] arr = { 12, 55, 65 };
		for (int i = 0; i <= arr.length; i++) {
			try {
				System.out.println(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("handled");
			}
		}

	}
}
