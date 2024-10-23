package assignments;

import java.util.Arrays;

public class Assignments35_Anagram_String {

	public static void main(String[] args) {
		
	
	String str1 = "fried";
	String str2= "fired";
	
	if(str1.length()!=str2.length()) {
		System.out.println("given string is not anagram as length not matched");
	}
	else {
	char[] c1 = str1.toCharArray();
	char[] c2 = str2.toCharArray();
	
  	Arrays.sort(c1);
  	Arrays.sort(c2);
	
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	
	boolean b1 = Arrays.equals(c1, c2);
	if(b1=true) {
		System.out.println("given string is anagram");
	}
	else {
		System.out.println("not anagram");
	}
	
}
}
}