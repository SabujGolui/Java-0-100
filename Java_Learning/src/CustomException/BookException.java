package CustomException;

class Exc extends Exception {
	private String book;

	Exc(String b) {
		book = b;
	}

	public String getBook() {
		return book;
	}
}

public class BookException {
	static void Submit() throws Exc {
		int a = 9;
		if (a > 10) {
			System.out.println("Go");
		} else {
			throw new Exc("Out");
		}
	}

	public static void main(String[] args) {
		try {
			Submit();
		} catch (Exc e) {
			System.out.println(e.getBook());
		}
	}
}
