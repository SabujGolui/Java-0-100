package CustomException;

class MobileExe extends Exception {
	private String str;

	MobileExe(String msg) {
		str = msg;
	}

	public String getStr() {
		return str;
	}
}

public class MobileException {
	static void Submit() throws MobileExe {
		int age = 22;
		if (age > 12) {
			System.out.println("You can Have It");
		} else {
			throw new MobileExe("Not Allowed");
		}
	}

	public static void main(String[] args) {
		try {
			Submit();
		} catch (MobileExe e) {
			String x = e.getStr();
			System.out.println(x);
		}
	}
}
