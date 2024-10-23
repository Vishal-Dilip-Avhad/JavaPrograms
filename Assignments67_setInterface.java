package assignments;

import java.util.HashSet;
import java.util.Set;

public class Assignments67_setInterface {
    public static void main(String[] args) {
       
        Set<String> fruits = new HashSet<>();

      
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        
        boolean isAdded= fruits.add("Mango");
        boolean isAdded2 = fruits.add("Apple"); 

     
        System.out.println("Fruits in the set: " + fruits);
        System.out.println("Was 'Apple' added again? " + isAdded2);
    }
}
