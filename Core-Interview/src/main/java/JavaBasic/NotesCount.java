package JavaBasic;

public class NotesCount {
	
	public static void main(String[] args) {
	
	int arr[] = {2000, 500, 1000, 300, 10};
	
	int rupes = 2500;
	
	int count = 0;
	
	for(int i = 0; i < arr.length; i++) {
		
		count = rupes / arr[i];
	
	if(count > 0) {
		System.out.println(arr[i] + " " + count);
	}
	
	rupes = rupes % arr[i];

	}
	}
}
