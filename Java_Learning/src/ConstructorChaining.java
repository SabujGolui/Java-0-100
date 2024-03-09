
public class ConstructorChaining {

	ConstructorChaining(int a) {
		System.out.println(a);
	}

	ConstructorChaining(String b) {
		this(120);
		System.out.println(b);
	}

	ConstructorChaining(String b, int s) {
		this("A");
		System.out.println(b + s);
	}

	ConstructorChaining(int s, String h) {
		this("b", 12);
		System.out.println(s + h);
	}

	public static void main(String[] args) {
		new ConstructorChaining(13, "SABUJ");
	}

}
