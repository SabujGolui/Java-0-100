package Collection_Practice;

import java.util.ArrayList;

public class CollectionAdd {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("me");
		a.add("you");
		a.add("Qspider");
		System.out.println(a);
		a.add(2, "ajama");
		System.out.println(a);
	}
}
