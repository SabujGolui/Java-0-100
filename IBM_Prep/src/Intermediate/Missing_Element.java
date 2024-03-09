package Intermediate;

import java.util.Scanner;

public class Missing_Element {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Length");
		int lenth = scan.nextInt();
		int a[] = new int[lenth];
		System.out.println("Input Array");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		int M = 0;
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
//			System.out.println(i);
			b[a[i] - 1] = 1;
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) {
				M = i + 1;
			}
		}

		System.out.println("Missing element is " + M);
	}
}
