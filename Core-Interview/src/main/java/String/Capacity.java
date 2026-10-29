package String;

public class Capacity {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("harshit");

		System.out.println("length :  " + sb.length()); // 7 character hai
		System.out.println("capacity : " + sb.capacity());// capacity chamta 23 hai
		System.out.println("append : " + sb.append("scgvchabscjmcbc"));// aappend add this

		System.out.println("............................................................");

		System.out.println("lenght : " + sb.length()); // 7 lenght
		System.out.println("append : " + sb.append("hbhjewbfubefu3fyu3")); // append matlab addd karna harshit ncecncb
																			// hb add hona
		System.out.println("capacity :" + sb.capacity());// capacity 22 currnt buffer me kitni chamta hai

		System.out.println(".................................................................");

		System.out.println("lenght : " + sb.length()); // harshit me kitni lenght hai;
		System.out.println("append : " + sb.append("ahhwhbdbfhewbf")); // add karne me append ka use karta hai;
		System.out.println("capacity :" + sb.capacity());// chamta hai

		////// output of String length, capacity, append

//capacity : 23
//append : harshitscgvchabscjmcbc
//............................................................
//lenght : 22
//append : harshitscgvchabscjmcbchbhjewbfubefu3fyu3
//capacity :48
//.................................................................
//lenght : 40
//append : harshitscgvchabscjmcbchbhjewbfubefu3fyu3ahhwhbdbfhewbf
//capacity :98

	}

}
