package JavaBasic;

public class FactorialNumber {
	
	public static void main(String[] args) {
	
	int num = 4; int fact = 1;
	
	for(int i = 1; i <= num; i++) {
		
		fact = fact * i;
		
		System.out.println(fact); // 1*1 = 1 1 * 2 = 2 , 2 * 3 = 6 * 4 = 24
		
	}
	}

}
