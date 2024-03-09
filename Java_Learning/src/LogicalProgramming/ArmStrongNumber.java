package LogicalProgramming;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int a = 153;
		int b = a;
		int sum = 0;
		while (a != 0) {
			int rem = a % 10;
			sum = sum + rem * rem * rem;
			a = a / 10;
		}
		if (b == sum) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not a ArmStrong Number");
		}
	}

}
