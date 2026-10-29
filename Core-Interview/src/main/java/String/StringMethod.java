package String;

public class StringMethod {
	
	public static void main(String[] args) {
		
		String str = "Harshit";
		String name = "Rishab";
		
		System.out.println("length : " + str.length());
		System.out.println("touppercase :" + str.toUpperCase());
		System.out.println("tolowercase :" + str.toLowerCase());
		System.out.println("InedxOf :" + str.indexOf("a"));
		System.out.println("indexEnd :" + str.lastIndexOf("t"));
		System.out.println("startsWith :" + str.startsWith("H"));
		System.out.println("endsWith :" + str.endsWith("t"));
		
		System.out.println(".......................................................");
		
		System.out.println("trim : " + name.trim());
		System.out.println("concat :" + name.concat(str));
		System.out.println("replace :" + name.replace("Harshit", "Rishab"));
		
	}

}

//    output : -

//length : 7
//touppercase :HARSHIT
//tolowercase :harshit
//InedxOf :1
//indexEnd :6
//startsWith :true
//endsWith :true
//.......................................................
//trim : Rishab
//concat :RishabHarshit
//replace :Rishab

