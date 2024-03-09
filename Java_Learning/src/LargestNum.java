
public class LargestNum {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };
		int brr = 0;
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] > brr) {
				brr = arr[i];
			}
		}
		System.out.println(brr);
	}
}
