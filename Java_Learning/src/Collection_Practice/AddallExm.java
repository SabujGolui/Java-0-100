package Collection_Practice;

import java.util.ArrayList;

public class AddallExm {
	public static void main(String[] args) {

		// Initializing a list of type arraylist
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(15);
		l.add(20);
		System.out.println(l);

		// Initializing a collection to be appended to list
		ArrayList arr = new ArrayList();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		System.out.println(arr);

		l.addAll(arr);

		System.out.println(l);

		arr.addAll(l);
		System.out.println(arr);

	}
}
