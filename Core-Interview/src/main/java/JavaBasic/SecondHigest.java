package JavaBasic;

public class SecondHigest {
	
	public static void main(String[] args) {
		
		int[] arr = {8, 3, 10, 15, 20};
		
		int s = 0;
		int f = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(f < arr[i]) {
				
				s = f;
				
				f = arr[i];
				
			}
			
			if(s < arr[i] && f > arr[i]) {
				s = f;
			}
		}
		
		System.out.println(s);
	}

}
