package LogicalProgramming;

public class RevValueLoopParams {
	static void loop(int a) {
		for (int i = 10; i >= a; i--) {
			System.out.print(" " + i);
		}
	}

	public static void main(String[] args) {
		loop(1);
	}
}
