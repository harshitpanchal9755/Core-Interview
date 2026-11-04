package String;

public class CountNoOfInteger {
	
	public static void main(String[] args) {
		
		String str = "Rishab23432";
		
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
