package CustomException;

class ShadiDotCom {
	static void submit() throws ShadiException {
		int age = 30;
		if (age > 21) {
			System.out.println("Elligible");
		} else {
			throw new ShadiException("Invalid age");
		}
	}

	public static void main(String[] args) {
		try {
			submit();
		} catch (ShadiException e) {
			String f = e.getmsg();
			System.out.println(f);
		}
	}

}

class ShadiException extends Exception {
	private String msg;

	ShadiException(String msg) {
		this.msg = msg;
	}

	public String getmsg() {
		return msg;
	}
}
