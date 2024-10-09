package assignments;
//assignment23
class Apartment{
	void Three_BHK() {
		System.out.println("2BHK not avilable");
	}
    
    void One_BHK() {
		System.out.println("1BKH avilable can purchase ");
	}
}
abstract class Row_Housing extends Apartment{
	abstract void One_RK();
	
	abstract void Two_BHK();
    
    void Price() {
		System.out.println("Row housing starting from 15 lacks");
	}
    void Adress(){
	   System.out.println("88, Area ---, plot Dist India");
   }
}
public class Abstract_Concrete2 extends Row_Housing{

	@Override
	void One_RK() {
		System.out.println("1RK avilable");	
	}
    @Override
	void Two_BHK() {
		System.out.println("2bhk avilable");
	}
	public static void main(String[] args) {
		Abstract_Concrete2 c2 = new Abstract_Concrete2();
		c2.Price();
		c2.Adress();
		
		c2.One_RK();
		c2.Two_BHK();
		
		c2.Three_BHK();
		c2.One_BHK();
		
	}

		
	}
	
		
		
	

