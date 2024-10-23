package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignments60 {
public static void main(String[] args) {
	
	Collection c1 = new ArrayList();
	c1.add(10);
	c1.add("Vishal");
	c1.add(5.5);
	c1.add('A');
	c1.add("10");
	c1.add(" ");
	c1.add(" ");
	c1.add(true);
	
	System.out.println(c1);
	System.out.println(c1.size());
	System.out.println(c1.isEmpty());
	
	
	Collection c2 = new ArrayList();
	c2.add("My bike-pulsor");
	c2.addAll(c1);
	System.out.println(c2);
	System.out.println(c2.containsAll(c1));
	
	boolean d1 = c1.contains("Vishal");
	System.out.println(d1);
	System.out.println(c1.remove(true));
	
}
}
