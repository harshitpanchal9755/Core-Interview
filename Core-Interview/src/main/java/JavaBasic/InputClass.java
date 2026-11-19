package JavaBasic;

import java.util.Scanner;

public class InputClass {
	
	public static void main(String[] args) {
		
		System.out.println("add");
		
		Scanner sc = new Scanner(System.in);
		
	     int num = sc.nextInt();
	     int num2 = sc.nextInt();
	     
	     System.out.println((num+num2));
	}

}
