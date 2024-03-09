package Intermediate;

import java.util.Scanner;
/*Coding Question :
Amant who is working at a software company forgot the password of his LinkedIn
Account. But he knows the ASCII values of his password in reverse order.
Help Aman to find the password.

To decode the password, first reverse the string of digits, then successively pick valid
values from the string and convert them to their ASCII equivalents. Some of the values
will have two digits, and others three. Use the ranges of valid values when decoding the
string Of digits.

Some of the ASCII values are given with their characters:
• The ASCII value of A to Z is 65 to 90.
• The ASCII value of a to z is 97 to 122.
• The ASCII value of space characters is 32.

Note: The password only has alphabets and blank spaces.
Given a string , decode the password by following the steps mentioned above.
Constraints:
• Isl
• s[il is an ascii character in the range [A-Za-zl or a space character
*/

public class ForgetPassword {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String Password = myObj.nextLine();
		char arr[] = Password.toCharArray();
		String current = "";
		String result = "";
		System.out.println(Password);

		for (int i = arr.length - 1; i > 0; i = i - 2) {
			current = "";
			current = "" + arr[i] + arr[i - 1];
			System.out.println(current);
			int n = Integer.parseInt(current);
			if (n == 32) {
				result += "";
			} else if ((n >= 65 && n <= 99) || (n >= 97 && n <= 99)) {
				result += (char) n;
			} else {
				if (i - 2 < 0) {
					break;
				}
				current += arr[i - 2];
				n = Integer.parseInt(current);
				result += (char) n;
				i--;
			}
		}
		System.out.println(result);
	}
}
