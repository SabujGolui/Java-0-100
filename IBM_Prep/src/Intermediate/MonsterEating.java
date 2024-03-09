/*Coding Question 2 :
There is a group of people which also includes two monsters in this group and they split
these groups among the people to kill them. When Monsters come into the group of
people, then at that time people leave their group.

After that, the breaking of the group will continue due to the monster's entry. And at
last, the group with the minimum length will be killed by the monsters.

Two types of monsters are present there namely @ and "$"
People are represented as a string "P"

Now you have to find out the minimum length of the group which will be killed by
monsters.*/

package Intermediate;

import java.util.Scanner;

public class MonsterEating {
	public static int solution(String s) {
		int a = 0, ans = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			a++;
			if (s.charAt(i) == '@' || s.charAt(i) == '$') {
				ans = Math.min(a, ans);
				a = 0;
			}

		}
		ans = Math.min(a, ans);
		return ans;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Str = scan.nextLine();
		int min = solution(Str);
		System.out.println(min);
	}

}
