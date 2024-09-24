package assignments;

class cars{
	void VOLKSWAGEN(){
		String Breaking= "ABS";
		int EngineCapacity=1200;
		System.out.println("VW  " +Breaking +EngineCapacity);
	}
    void HONDA(){
    	String Breaking= "Hybrid";
		int EngineCapacity=1500;
		System.out.println("Honda "+Breaking+EngineCapacity);
	}
    void MARUTI(){
    	String Breaking= "Noraml Braking";
		int EngineCapacity=1200;
		System.out.println("Maruti"+Breaking+EngineCapacity);
    }
}


public class Single_Level_Inheritance_Non_Static extends cars {
	
	void HUNDAI(){
		System.out.println("Ground clearance in mm"+115);
	}
     public static void main(String[] args) {
    	 Single_Level_Inheritance_Non_Static s1= new Single_Level_Inheritance_Non_Static();
    	 s1.HUNDAI();
    	 s1.VOLKSWAGEN();
    	 s1.HONDA();
    	 
	
}
	
}

