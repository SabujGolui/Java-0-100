package LogicalProgramming;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 5, count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("not a prime number");
		}
	}
}
