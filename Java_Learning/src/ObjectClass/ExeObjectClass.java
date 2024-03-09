package ObjectClass;

public class ExeObjectClass {
	public static void main(String[] args) {
		ExeObjectClass t = new ExeObjectClass();
		ExeObjectClass e = t;
		ExeObjectClass r = new ExeObjectClass();
		System.out.println("i'm using toString method " + t.toString()); // returns fully qualified path
		System.out.println("i'm using hashCode method " + t.hashCode()); // returns unique integer to each instance
		System.out.println("i'm using equals method " + t.equals(r)); // compare object addresses
		System.out.println("i'm using equals method " + t.equals(e)); // compare object addresses
	}
}
