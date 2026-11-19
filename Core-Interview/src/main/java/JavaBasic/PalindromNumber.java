package JavaBasic;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
	int num = 121;
	int num2 = num;
	int temp = 0;
	int r = 0;
	
	for(int i = 0; i <= num; i++) {
		
		while(num2 > 0) {
			
			r = num2 % 10;
			
			temp = temp * 10 + r;
			
			num2 = num2 / 10;
			
		}
		
		if(temp == num) {
			System.out.println("palindrom");
			
		}else {
			System.out.println("not palindrom");
		}
		
	
	}
		
	}

}
