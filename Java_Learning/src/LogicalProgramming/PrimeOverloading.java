package LogicalProgramming;

public class PrimeOverloading {
	static void prime(int a) {
		System.out.println("this is a prime number");
	}

	static void prime() {
		System.out.println("not a prime number");
	}

	public static void main(String[] args) {
		int b = 5;
		int count = 0;
		for (int i = 1; i <= b; i++) {
			if (b % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			prime(count);
		} else {
			prime();
		}
	}
}
