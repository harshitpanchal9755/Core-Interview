package String;

public class CountNoofCharFormString {

	public static void main(String[] args) {

		String s = "harshitt";
		
		int hcount = 0;
		int tcount = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == 'h') {
				hcount++;
			}
			
			if(s.charAt(i) == 't') {
				tcount++;
			}
		
			
		}
		
		System.out.println("h :" + hcount);
		System.out.println("t :" + tcount);
		
		
	}  // output : - h :2	t :2

}


// char me string ke double char ko count karke output deta hai
