package basicprogramming;

public class Static_Methods {

	
	static void start() {
		System.out.println("this is start ");
		
	}
	
	public static void begining() {
		System.out.println("this is begining");
		
	}
	
	private static void processing() {
		System.out.println("this is processing");
	}
	
    private static void MyHeight() {
		
		int height=183;
		System.out.println(height);
	}
	
    public static void MyWeight() {
    	double weight= 65.46;
    	System.out.println(weight);
    }
    
   public static void display() {
	  System.out.println("we are calling by classname");
   }
   
  public static int mygrade= 4;
   
   public static void displaymygrade() {
	   System.out.println(mygrade);
   }
  
  static String s1= "INDIA";
  static void displayCountry() {
	  System.out.println(s1);
  }
     
  static boolean f2=true;
     static void displaybooleanresult() {
    	 System.out.println(f2);
     }
 
  public static void main(String[] args) {
		
		System.out.println("this is main method");
		start();
		begining();
		processing();
		MyHeight();
		MyWeight();
		Static_Methods.display();
		displaymygrade();
		displayCountry();
		displaybooleanresult();
		
		
	}	
}
