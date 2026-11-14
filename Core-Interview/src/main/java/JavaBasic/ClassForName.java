package JavaBasic;

public class ClassForName {
	
	public void display() {
		System.out.println("object is created");
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			Class<?> clazz = Class.forName("javabasic.CLassForName");
			
			ClassForName example = (ClassForName) clazz.getDeclaredConstructor().newInstance();
			
			example.display();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
