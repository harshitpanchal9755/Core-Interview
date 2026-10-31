package String;

public class CountOccuranceFormString {
	
	public static void main(String[] args) {
		
		String s = "harshit";
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			
			int count = 0;
			
			for(int i = 0; i < s.length(); i++) {
				
				if(s.charAt(i) == ch) {
					count++;
				}
			}
			
			if(count > 0) {
				System.out.println(ch + " = " + count);
			}
		}// output :- h = 2, a = 1 i = 1; t = 1; 
	}

}
