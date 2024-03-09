
class Father {
	void eat() {
		System.out.println("food");
	}
}

class Son extends Father {
	void cycle() {
		System.out.println("Cycle");
	}
}

class Grandson extends Son {
	void toys() {
		System.out.println("Toys");
	}
}

public class Inheritence {

	public static void main(String[] args) {
		Grandson g = new Grandson();
		g.eat();
		g.cycle();
		g.toys();
	}

}
