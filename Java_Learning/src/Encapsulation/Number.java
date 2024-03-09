package Encapsulation;

class Num {
	private long num;

	public long getid() {
		return num;
	}

	public void setid(long a) {
		num = a;
	}
}

public class Number {
	public static void main(String[] args) {
		System.out.println(args[0]);

		Num p = new Num();
		p.setid(74310711);
		System.out.println(p.getid());
	}
}
