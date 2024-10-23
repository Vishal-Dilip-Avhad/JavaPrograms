package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Assignments65_listIterator {

	public static void main(String[] args) {
		

		List l1 = new ArrayList();
		l1.add(22);
		l1.add(66);
		l1.add(33);
		l1.add(99);
		l1.add(77);
		Collections.sort(l1);
		
		System.out.println(l1);
		
		ListIterator l2 = l1.listIterator();
		
		System.out.println("forward");
		while(l2.hasNext()) {
			System.out.println(l2.next());
		}
		
		System.out.println("reverse ");
		while(l2.hasPrevious()) {
			System.out.println(l2.previous());
		}
	}
}
//first forword only