package String;

public class Capacity {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");
	
			
			System.out.println(sb.length());
			System.out.println(sb.append("abcd"));
			System.out.println(sb.capacity());// 16 + 5 
		}
	}

