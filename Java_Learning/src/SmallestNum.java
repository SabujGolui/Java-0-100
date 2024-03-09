
public class SmallestNum {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };
		int smm = arr[0];
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] < smm) {
				smm = arr[i];
			}
		}
		System.out.println(smm);
	}
}
