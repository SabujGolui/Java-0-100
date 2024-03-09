
public class StrongNumber {
	public static void main(String[] args) {
		int a = 145;
		int b = a;
		int sum = 0;

		while (a != 0) {
			int fact = 1;
			int rem = a % 10;
			for (int i = rem; i > 0; i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			a = a / 10;
		}

		if (b == sum) {
			System.out.println(" Strong Number");
		} else {
			System.out.println("Not a Strong Numbers");
		}
	}
}
