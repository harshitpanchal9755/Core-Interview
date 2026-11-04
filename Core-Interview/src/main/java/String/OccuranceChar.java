package String;

public class OccuranceChar {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		
		int count = 0;
		
		char ch = 'l';
		
		for(int i = 0; i < s.length(); i ++) {
			
			if(s.charAt(i) == ch) {
				count++;
				
			}
		}
		
		if(count > 0) {
			System.out.println(ch + "=" + count);
		}
	}

}
