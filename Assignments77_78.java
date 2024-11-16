package assignments;

public class Assignments77_78 {

	public static void main(String[] args) {
		
		int intvalue=100;            
		long longvalue=intvalue;        //upcasting 
		System.out.println(longvalue);
		
		
		float f1= 1.5f;
		double d1=f1;                   //upcasting 
		System.out.println(d1);
		
		
		long longvalue1= 1000000;
		int intvalue1= (int) longvalue1;    //downcasting
		System.out.println(intvalue1);
	}
}
