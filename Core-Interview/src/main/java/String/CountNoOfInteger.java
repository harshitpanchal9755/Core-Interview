package String;

public class countNoOfInteger {
	
	public static void main(String[] args) {
		
		String str = "harshit";
		
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
