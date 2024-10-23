package assignments;

public class Assignments44 {
	
	static int alphabates;
public static void main(String[] args) {
	
	String name= "Kv no 2";
	char c1[]= name.toCharArray();
	
	for (int i=0; i<name.length(); i++) {
		boolean b1 = Character.isAlphabetic(c1[i]);
		
		if(b1==true) {
			alphabates++;
			
		}	
	}
	System.out.println(alphabates);
	}
	
}

