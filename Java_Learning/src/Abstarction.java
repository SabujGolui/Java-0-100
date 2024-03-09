interface Abstarction1 {
	void set();

	void dop();
}

class Imp implements Abstarction1 {
	public void set() {
		System.out.println("hi");
	}

	public void dop() {
		System.out.println("ho");
	}
}

class Abstarction {
	public static void main(String[] args) {
		Imp i = new Imp();
		i.set();
		i.dop();
	}
}
