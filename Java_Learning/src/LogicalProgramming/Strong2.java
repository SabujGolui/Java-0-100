package LogicalProgramming;

// if num is 123 = 1 + 1*2 + 1*2*3
public class Strong2 {
	public static void main(String[] args) {
		int num = 145, temp = num;
		int res = 0;
		while (num != 0) {
			int fact = 1;
			int rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			res = res + fact;
			num = num / 10;
		}

		if (res == temp) {
			System.out.println("Strong Num   " + res);
		} else {
			System.out.println("Not a strong Num   " + res);
		}

	}
}
