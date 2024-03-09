package LogicalProgramming;

public class ArrayPrimeNo {
	public static void main(String[] args) {
		int[] a = { 18, 5, 20, 45, 5, 60 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(a[i] + "  Is a Prime no");
			} else {
				System.out.println(a[i] + "  Is not a Prime no");
			}
			count = 0;
		}
	}
}
