package JavaBasic;

public class Fobonnaciseries {
	
	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
		int next;
		
		for(int i = 1; i <= 11; i++) {
			System.out.println(first + " ");
			
			next = first + second;
			second = first;
			first = next;
			
		}
	}

}
