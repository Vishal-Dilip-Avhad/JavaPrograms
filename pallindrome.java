package assignments;

public class pallindrome {
	public static void main(String[] args) {
		
		String str= "NITIN";
		String output =" ";
		
		String num = "12321";
		String out = " ";
	
	for(int i=str.length()-1; i>=0; i--) {
			
			char c1=str.charAt(i);
			
			output= output+c1;
			
			System.out.println(c1);
		}
	for(int i=num.length()-1; i>=0; i--) {
		
		char c1=num.charAt(i);
		
		output= output+c1;
		
		System.out.println(c1);
	}
	boolean b1= str.equals(output);
	boolean n1=num.equals(out);
	if (b1==true && n1==true) {
		System.out.println("given string is pallindrome");
	}
	else {
		System.out.println("given string is not pallindrome");
	}
}
		
}
