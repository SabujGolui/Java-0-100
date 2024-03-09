
class Arr {
	void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

public class ArrayBWClass {
	public static void main(String[] args) {
		int b[] = { 12, 13, 14, 15, 16 };
		Arr a = new Arr();
		a.print(b);
	}
}
