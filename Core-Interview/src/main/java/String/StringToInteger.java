package String;

public class StringToInteger {
	
	public static void main(String[] args) {
		
	String str = "Harshiut123";
	
	int count = 0;
	
	for(int i = 0; i < str.length(); i++) {
		
		if(Character.isDigit(str.charAt(i))) {
			
			count++;
			
		}
	}
	
	if(count > 0) {
		System.out.println(count);
	}
	
	}

}
