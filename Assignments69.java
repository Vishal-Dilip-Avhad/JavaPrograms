package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignments69 {

	public static void main(String[] args) {
		
	Map<String, Integer> m1= new HashMap<String, Integer>();
	m1.put("John", 1);
	m1.put("TOM", 2);
	m1.put("Jerry", 3);
	m1.put("Spider",4);
	m1.put("Spider", 4);
	m1.put(null, null);
	m1.put(null, null);
	
	System.out.println(m1);
		

	}
}
