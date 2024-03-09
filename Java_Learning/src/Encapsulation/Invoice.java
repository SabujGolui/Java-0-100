package Encapsulation;

class Inv {
	public String id = "hi";

	public String getid() {
		return id;
	}

	public void setid(String a) {
		id = a;
	}
}

public class Invoice {
	public static void main(String[] args) {
		Inv p = new Inv();
		p.setid("1664ygygy616");
		System.out.println(p.getid());
		System.out.println(p.id);
	}
}
