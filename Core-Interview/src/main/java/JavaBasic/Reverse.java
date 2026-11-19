package JavaBasic;

public class Reverse {
	
	public static void main(String[] args) {
		
		int num = 1234;
		int temp = 0;
		int r = 0;
		
		while(num > 0) {
			
			r = num % 10;
			temp = temp * 10 + r;
			num = num / 10;
			
		}
		
		System.out.println("Reverse Number 1234 :- " + " " + temp);
	}

}
