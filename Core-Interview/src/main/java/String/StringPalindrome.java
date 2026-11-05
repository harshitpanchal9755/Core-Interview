package String;

public class StringPalindrome {

	public static void main(String[] args) { // string first to end or rev me sam ho wo hota hai palindrom

		String str = "madam harshot";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {

			System.out.println("this is plaindrom");

		} else {

			System.out.println("this not palindrom");

		}

	}

}