package String;

public class StringToInteger {
	
	public static void main(String[] args) {
		
	String str = "Harshiut123";
	
	String num = "";
	
	for(int i = 0; i < str.length(); i++) {
		
		char ch = str.charAt(i);
		
		if(ch >= '0' && ch <= '9') {
			
			num = num + ch;
			
		}
	}
	
	int result = Integer.parseInt(num);
	System.out.println(result);
	
	}

}
