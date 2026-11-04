package String;

public class CountVowesArrays {
	
	public static void main(String[] args) {
		
		String s = "Hellojaebwr";
		
		char[]  ch = {'a', 'e', 'i', 'o', 'u'};
		
		for(int i = 0; i < ch.length; i++ ) {
			
			int count = 0; 
			
			for(int j = 0; j < s.length(); j++) {
				
				if(ch[i] == s.charAt(j)){
					
					count++;
					
				}
			}
			
			if(count > 0) {
				System.out.println(ch[i] + "=" + count);
			}
		}
	}

}
