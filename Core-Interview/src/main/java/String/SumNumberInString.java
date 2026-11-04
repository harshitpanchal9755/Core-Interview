package String;

public class SumNumberInString {
	
	public static void main(String[] args) {
		
		String str = "Hatshbjdb123432";
		
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				
				sum = sum + Character.getNumericValue(str.charAt(i));
				count++;
			}
		}
		
		System.out.println(sum);
		System.out.println(count);
	}

}
