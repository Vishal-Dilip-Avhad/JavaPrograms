package assignments;

import java.util.stream.IntStream;

public class Assignments36_aplha_whitesopace_digitd {
	
	static int whitespace;
	public static void main(String[] args) {
		
		String str= "JAVA BY MKT 123";
		char c1[] = str.toCharArray();
		
		
		System.out.println("alphabates in given string");		
		for(int i=0; i<str.length(); i++) {
			if(Character.isAlphabetic(c1[i])) {
				System.out.println(c1[i]);
			}
		}
		System.out.println("digits in given string");	
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(c1[i])) {
				System.out.println(c1[i]);
			}
		}
		System.out.println("white spaces in given string");	
		for(int i=0; i<str.length(); i++) {
			if(Character.isWhitespace(c1[i])) {
				System.out.println(c1[i]);
				
				boolean b1 = Character.isWhitespace(c1[i]);
				whitespace++;
				System.out.println(whitespace);
			}
		}
	
		}
		
	}

