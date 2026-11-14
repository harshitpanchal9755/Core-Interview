package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		
		list.forEach(li -> System.out.println(li));
	}

}
