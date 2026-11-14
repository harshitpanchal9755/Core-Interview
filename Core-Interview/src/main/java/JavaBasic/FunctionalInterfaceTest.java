package JavaBasic;

public class FunctionalInterfaceTest implements FunctionalInterface {

	@Override
	public int sum(int a, int b) {
	return a + b;
		
	}
	
	public static void main(String[] args) {
		
		FunctionalInterfaceTest t = new FunctionalInterfaceTest();
		
	/// abstract method ////
	
		System.out.println(t.sum(10,5));
		
		/// subtract ////
		
		FunctionalInterface.sub(10, 5);
		
		// multi
		
t.multi(10, 5);
	}
	
	
	}

	
	
		
	




