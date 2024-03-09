package CustomException;

class Cigarette extends Exception {
	private String msg;

	Cigarette(String a) {
		msg = a;
	}

	public String getmsg() {
		return msg;
	}
}

public class CigaretteException {
	static void Submit() throws Cigarette {
		int a = 15;
		if (a > 18) {
			System.out.println("Go");
		} else {
			throw new Cigarette("Out");
		}
	}

	public static void main(String[] args) {
		try {
			Submit();
		} catch (Cigarette e) {
			System.out.println(e.getmsg());
		}
	}
}
