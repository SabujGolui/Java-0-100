interface ABS {
	abstract void food();
}

class Street implements ABS {
	@Override
	public void food() {
		System.out.println("Fish Fry");
	}
}

abstract class you implements ABS {
	abstract void no();
}

class Home implements ABS {
	@Override
	public void food() {
		System.out.println("Dal Bhat");
	}
}

class lunch {
	static void plate(ABS a) {
		a.food();
	}
}

public class AbstractionExm {
	public static void main(String[] args) {
		Street s = new Street();
		Home h = new Home();
		lunch.plate(s);
		lunch.plate(h);

	}
}
