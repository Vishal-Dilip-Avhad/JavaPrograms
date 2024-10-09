package assignments;

import java.util.Arrays;

public class Update_array_value {

	public static void main(String[] args) {
		
	
       String stocks[] = new String[3];
       stocks[0]="TATA-404";
       stocks[1]="GAIL-369";
       stocks[2]="RELIANCE-4869";
    		   
	   System.out.println(stocks[1]);
	   stocks[1]="SAIL-5000";
	   System.out.println("updated stocks "+stocks[1]);
	  
	    String color[]= { "green", "red" , "yellow" };
		color[2]="blue";
		System.out.println(Arrays.toString(color));
	}
	
	
	
}

