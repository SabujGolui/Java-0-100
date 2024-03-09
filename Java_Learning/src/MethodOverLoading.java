
public class MethodOverLoading {
	static void me() {
		System.out.println("Yo");
	}

	static void me(int a) {
		System.out.println("Yo " + a);
	}

	static void me(String a) {
		System.out.println("Yo" + a);
	}

	public static void main(String[] args) {
		me();
		me(1);
		me("Boy");
	}

}
