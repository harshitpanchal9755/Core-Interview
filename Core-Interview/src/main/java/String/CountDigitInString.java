package String;

public class CountDigitInString {
	
	public static void main(String[] args) {
		
		String str = "Harshit";
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				count++;
				
			}
		}
		
		if(count > 0) {
			System.out.println(count);
		}
	}

}
