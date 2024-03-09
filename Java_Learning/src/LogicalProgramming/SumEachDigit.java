package LogicalProgramming;

public class SumEachDigit {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while (num != 0) {
			int res = num % 10;
			sum = sum + res;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
