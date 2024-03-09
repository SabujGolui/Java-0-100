
class Demo1 {
	Demo1(int a) {
		System.out.println(a);
	}
}

class Demo2 extends Demo1 {
	Demo2(String a) {
		super(100);
		System.out.println(a);
	}
}

class Demo3 extends Demo2 {
	Demo3(String a, int b) {
		super("Sabuj");
		System.out.println(a + b);
	}
}

public class SuperConstructor {
	public static void main(String[] args) {
		new Demo3("sa", 10);
	}
}
