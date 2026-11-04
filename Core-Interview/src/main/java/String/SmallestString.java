package String;

public class SmallestString {
	
	public static void main(String[] args) {
	
	String[] arr = {"java", "hello"};
	
	String smallest = arr[0];
	
	for(int i = 0; i < arr.length; i++) {
		
		if(arr[i].length() < smallest.length()) {
			
			smallest = arr[i];
		}
	}
	
	System.out.println(smallest);
	System.out.println(smallest.length());

	}

}
