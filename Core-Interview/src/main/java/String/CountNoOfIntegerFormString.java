package String;

public class CountNoOfIntegerFormString {

	public static void main(String[] args) {
	
	String s = "Java123";
	
	int count = 0;
	
	for(int i = 0; i < s.length(); i++) {
		
		if(Character.isDigit(s.charAt(i))) {
			count++;
		}
	}
	
	if(count > 0) {
		System.out.println(count);
	}

}
}
