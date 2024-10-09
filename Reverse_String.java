package assignments;

import java.awt.im.InputContext;

public class Reverse_String {

	public static void main(String[] args) {
	
	String str= "AUTOMATION_BY_MKT";
	String output =" ";
	
	System.out.println(str.length());
	System.out.println(str.charAt(0));
	
	System.out.println("printing in reverse order");
	for(int i=str.length()-1; i>=0; i--) {
		
		char c1=str.charAt(i);
		
		output= output+c1;
		
		System.out.println(c1);
	}
	
	}
	
}
