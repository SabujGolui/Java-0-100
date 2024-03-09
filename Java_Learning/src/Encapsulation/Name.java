package Encapsulation;

class person {
	private String id;

	public String getid() {
		return id;
	}

	public void setid(String a) {
		id = a;
	}
}

public class Name {
	public static void main(String[] args) {
		person p = new person();
		p.setid("Sabuj");
		System.out.println(p.getid());
	}
}
