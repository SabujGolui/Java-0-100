package CustomException;

class LiquorExc extends Exception {
	private String smg;

	LiquorExc(String massege) {
		smg = massege;
	}

	public String getStr() {
		return smg;
	}
}

class Liquor {
	static void Submit() throws LiquorExc {
		int age = 19;
		if (age > 18) {
			System.out.println("Elligible");
		} else {
			throw new LiquorExc("not elligible");
		}
	}
}

public class LiquorException {
	public static void main(String[] args) {
		try {
			Liquor.Submit();
		} catch (LiquorExc e) {
			String x = e.getStr();
			System.out.println(x);
		}
	}
}
