package CustomException;

class PnumExe extends Exception {
	private String str;

	PnumExe(String msg) {
		str = msg;
	}

	public String getStr() {
		return str;
	}
}

public class PostiveException {
	static void Submit() throws PnumExe {
		int age = 22;
		if (age > 0) {
			System.out.println("It's a Positive Number");
		} else {
			throw new PnumExe("its not");
		}
	}

	public static void main(String[] args) {

		try {
			Submit();
		} catch (PnumExe e) {
			String x = e.getStr();
			System.out.println(x);
		}
	}
}
