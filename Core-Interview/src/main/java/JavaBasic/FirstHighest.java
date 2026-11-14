package JavaBasic;

public class FirstHighest {
	
	public static void main(String[] args) {
		
		int[] arr = {1 , 3, 5, 10, 24, 88, 99};
		
		int h = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > h) {
				
				h = arr[i];
				
			}
		}
		
		System.out.println(h);
	}

}
