package assignments;

public class Multilevel_Sub_Class extends Multilevel_Parent_Class2{
	
   void Sportscar() {
		System.out.println("NOS Speed");
	}
	
    static void ElectricBike() {
    	System.out.println("Battery");
    }
	public static void main(String[] args) {
		
	Multilevel_Sub_Class m1= new Multilevel_Sub_Class();
	m1.FourWheelers();
	m1.vechile();
	m1.cars();
	m1.Sportscar();
	
	oldmotorcycle();
	motorcycle();
	bikes();
	ElectricBike();
	
	
	}
}
