import java.util.ArrayList;

public class ForEachLoop {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(50);
		l.add(45);
		l.add(17);

		System.out.println(l);

		for (int e : l) {
			System.out.println(e);
		}

	}

}
