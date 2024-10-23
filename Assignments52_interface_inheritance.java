package assignments;

interface MRP {

	void MRP_On_Products();
}

class wholsalers implements MRP  {

	@Override
	public void MRP_On_Products() {
		System.out.println("for wholsarers rate 80rs");
		
	}
}
class retailers implements MRP {

	@Override
	public void MRP_On_Products() {
		System.out.println("for ratailer rate 90rs");
		
	}	
}
public class Assignments52_interface_inheritance{
	
	public static void main(String[] args) {
		wholsalers w1 = new wholsalers();
		retailers  r1 = new retailers();
		
		w1.MRP_On_Products();
		r1.MRP_On_Products();
	}
}