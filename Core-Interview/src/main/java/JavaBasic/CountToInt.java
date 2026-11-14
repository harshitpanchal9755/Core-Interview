package JavaBasic;

public class CountToInt {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3, 4,5,2};
		int num = 2;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(num == arr[i]) {
				count++;
			}
			
			System.out.println(count);
		}
	}

}
