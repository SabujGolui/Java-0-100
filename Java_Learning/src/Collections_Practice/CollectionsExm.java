package Collections_Practice;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsExm {
	public static void main(String[] args) {

		ArrayList<Character> l1 = new ArrayList<Character>();
		l1.add('a');
		l1.add('v');
		l1.add('c');
		l1.add('x');

		System.out.println(l1);
		// l1.add("java");

		// System.out.println(l1);

//		for (int i = 0; i < l1.size(); i++) {
//			System.out.println(l1.get(i));
//		}

//		for (Object x : l1) {
//			System.out.println(x);
//		}

//		Integer x = new Integer(10);
//
//		System.out.println(x);
//
//		int y =(int) x;
//
//		System.out.println(y);

		Map<String, Integer> h1 = new TreeMap<String, Integer>();
		h1.put("kohli", 1500);
		h1.put("dhoni", 1000);
		h1.put("rohit", 1600);
		h1.put("maxi", 1600);
		// h1.put("rohit", 1600); map will not allow duplicate keys.
		System.out.println(h1);
	}
}
