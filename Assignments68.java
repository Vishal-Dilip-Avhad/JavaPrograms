package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Assignments68 {
public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add(22);
		l1.add(66);
		l1.add(33);
		l1.add(99);
		l1.add(77);
		
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
		
		Iterator i1 = l1.iterator();
		
	  	while(i1.hasNext()) {
			Object num= i1.next();
			
			if(num.equals(99)) {
				i1.remove();
			}
		}
		System.out.println(l1);
		
		
	}
}
