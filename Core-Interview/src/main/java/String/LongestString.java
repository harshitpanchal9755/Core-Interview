package String;

public class LongestString {
	
	public static void main(String[] args) {
		
		String[] arr = {"hello", "java"};
		
		String longest = arr[0]; 
		
		for(int i = 0; i < arr.length; i++) {
			
			if( arr[i].length() > longest.length())  {
				
				longest = arr[i];
				
			}
				
		}
		
		System.out.println("lonhest String :" + longest);
		System.out.println("longest length : " + longest.length());
	}

}
