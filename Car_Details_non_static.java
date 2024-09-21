package basicprogramming;

public class Car_Details_non_static {
	
	     
	     
	     void cardetails(String name, float capacityLit, int EngineCylinder) {
	    	 System.out.println(name);
	    	 System.out.println(capacityLit);
	    	 System.out.println(EngineCylinder);
	    	 
	    	
	     }
	   
	     
	     public static void main(String[] args) {
	    	Car_Details_non_static c1= new Car_Details_non_static();
	    	c1.cardetails("maruti", 1.2f, 4);
			
		}
	     
	}


