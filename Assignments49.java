package assignments;

public class Assignments49 {
	public static void main(String[] args) {
    	
   	 String str= "RAM";
   	 
   	 for(int i=0; i<=str.length()-1; i++) {
       	 System.out.println(str.charAt(i));
        }

        System.out.println();
        
        for(int i=str.length()-1; i>=0; i--) {
       	 System.out.println(str.charAt(i));
        }
}
}
