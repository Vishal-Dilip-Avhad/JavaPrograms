package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assignments70 {

	public static void main(String[] args) {
		
		Map<String, Double> m1 = new HashMap<String , Double >();
		m1.put("ClassA", 55.96);
		m1.put("ClassB", 85.66);
		m1.put("ClassC", 95.46);
		m1.put("ClassD", 65.66);
		m1.put("ClassE", 25.56);
		m1.put("ClassE", 35.36);
		m1.put(null, null);
		
		System.out.println(m1);
		m1.remove("ClassE", 25.56);
		System.out.println(m1);
		
		
		Map<String, Double> m2 = new HashMap<String , Double >();
		m2.put("ClassF", 95.96);
		m2.putAll(m1);
		System.out.println(m2);
		
		boolean b1 = m1.isEmpty();
		System.out.println(b1);
		
		//m1.clear();
		System.out.println(m1.keySet());
		
		//iteration using keyset
		for( String a1 :  m1.keySet()){
			
			System.out.println(a1);
		}
		//iteration using values
        for( Double i1 :  m1.values()){
			
			System.out.println(i1);
		}
        //iteration using entryset
        for(Entry<String, Double> i2 : m1.entrySet()) {
    	 System.out.println(i2);
       }
        //iteration using iterator
        Iterator <Entry <String, Double>> i3 =  m1.entrySet().iterator();
        while(i3.hasNext()) {
        	System.out.println(i3.next());
        }
	}
}
