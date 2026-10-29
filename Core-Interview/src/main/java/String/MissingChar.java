package String;

public class MissingChar {
	
	public static void main(String[] args) {
		
		
		String str = "harshit";
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			
			int count = 0;
			
			for(int i = 0; i < str.length(); i++) {
				
				if(str.charAt(i) == ch) {
					count++;
				}
			}
				if(count == 0) {
					System.out.println(ch + "=" + count);
				}
		}

		}
	
	//// b=0  output
//c=0
//d=0
//e=0
//f=0
//g=0
//j=0
//k=0
//l=0
//m=0
//n=0
//o=0
//p=0
//q=0
//u=0
//v=0
//w=0
//x=0
//y=0
//z=0

	

}
