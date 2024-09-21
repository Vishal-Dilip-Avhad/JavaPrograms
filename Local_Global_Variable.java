package basicprogramming;

public class Local_Global_Variable {

  public static void local() {    //local variable non static method
	final int x=111;
	System.out.println("final local variable---"+x);
  }
	
public static void main(String[] args) {
	
	local();
	
	Local_Global_Variable l1 = new Local_Global_Variable();
	
	System.out.println(l1.z);
	System.out.println(l1.z+y);
	
	int G=99;             //declared
	System.out.println(G);
}
	
    int z=20;          //global variable  non static
	static int y=5;    // global static variable 
	
	int G;      //initialize 

	
}