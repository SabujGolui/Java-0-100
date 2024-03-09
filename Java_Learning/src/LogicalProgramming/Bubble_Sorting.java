package LogicalProgramming;

import java.util.Arrays;

public class Bubble_Sorting {
	public static void main(String[] args) {
		int[] a = { 12, 23, 47, 1, 70 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}
		String s = Arrays.toString(a);
		System.out.println(s);
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}
}
