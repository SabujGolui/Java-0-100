
class God {
	void Bless() {
		System.out.println("God Bless");
	}
}

class Me extends God {
	@Override
	void Bless() {
		System.out.println("God Bless Me");
	}
}

class He extends God {
	@Override
	void Bless() {
		System.out.println("God Bless You");
	}
}

class Temple {
	static void Prey(God g) {
		g.Bless();
	}
}

public class Polimorphism {
	public static void main(String[] args) {
		Me m = new Me();
		He y = new He();
		Temple.Prey(m);
		Temple.Prey(y);
	}

}
