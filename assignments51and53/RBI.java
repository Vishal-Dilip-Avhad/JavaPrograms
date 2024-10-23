package assignments51and53;

public class RBI extends SBI implements Bank

{

	void IPO() {
		System.out.println("IPO ");
	}
	void stocks() {
		System.out.println("nifty 500");
	}
	public static void main(String[] args) {
	RBI r1= new RBI();
	r1.Bonds();
	r1.loan();
	r1.IPO();
	r1.FD();
	r1.creditcard();
	r1.debitcard();
	r1.stocks();
	r1.RD();
		
	}
	@Override
	public void creditcard() {
		System.out.println("credit card avial");
	}
	@Override
	public void debitcard() {
		System.out.println("dedit card avial");
		
	}
	@Override
	void loan() {
		System.out.println("loan avial");
		
	}
	@Override
	void FD() {
		System.out.println(" FD avial");
		
	}

}