package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignments64_iteration {
	 public static void main(String[] args) {
	        
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Date");

	        // Iterating using Iterator
	       
	        Iterator<String> iterator = fruits.iterator();
	        while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            System.out.println(fruit);
	        }
	    }
}
