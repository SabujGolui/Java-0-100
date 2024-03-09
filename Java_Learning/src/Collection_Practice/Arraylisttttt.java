package Collection_Practice;

import java.util.ArrayList;

public class Arraylisttttt {
	public static void main(String[] args) {
//	Arraylist l1=new Arraylist();
//	l1.ad
		ArrayList l1 = new ArrayList();
		l1.add("world_cup");
		l1.add(300);
		l1.add("mobile");

		// System.out.println(l1);

		ArrayList l2 = new ArrayList();
		l2.add("world_cup");
		l2.add(250);

		// System.out.println(l2);

		// l1.addAll(1, l2);

//		l1.retainAll(l2);
//
//		System.out.println(l1);
//		System.out.println(l2);
		if (l1.contains(300)) {

			System.out.println("yes it is presented");
		} else {
			System.out.println("no it is not presented");
		}
	}
}
