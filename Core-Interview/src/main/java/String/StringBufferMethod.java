package String;

public class StringBufferMethod{
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("java");
		System.out.println("length"+ sb.length());
		
		System.out.println("delete : " + sb.delete(0, 3));
		
		System.out.println("toString" + sb.toString());
		System.out.println("CharAt:" + sb.charAt(1));
		
	}

}
