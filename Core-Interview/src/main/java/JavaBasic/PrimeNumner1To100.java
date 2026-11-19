package JavaBasic;

public class PrimeNumner1To100 {
	
	public static void main(String[] args) {
		
		for(int num = 2; num <= 10; num++) {
			
			int count = 0;
			
			for(int i = 2; i < num -1; i++) {
				
				if(num % i == 0) {
					count++;
				}
			}
			
			if(count == 0) {
				System.out.println(num);
			}
		}
	}

}
