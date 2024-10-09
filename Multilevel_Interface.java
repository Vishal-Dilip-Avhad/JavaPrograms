package assignments;

interface Money{
	void currency();
	abstract void Digital_Currency();
}
interface Cards extends Money{
	void credit_card();
	abstract void debit_card();
}

interface wallet extends Cards{
	void e_wallet();
	abstract void physical_wallet();
}

class transaction implements Money, Cards, wallet{

	@Override
	public void e_wallet() {
		System.out.println("e wallet");
		
	}

	@Override
	public void physical_wallet() {
	System.out.println("physical money");
		
	}

	@Override
	public void credit_card() {
		System.out.println("american express credit card");
		
	}

	@Override
	public void debit_card() {
		System.out.println("rupee dbit card");
		
	}

	@Override
	public void currency() {
		System.out.println("INR, DOLLAR");
		
	}

	@Override
	public void Digital_Currency() {
		System.out.println("bitcoin");
	}
	
}

public class Multilevel_Interface {
	
public static void main(String[] args) {
	
transaction t1 = new transaction();
t1.currency();
t1.Digital_Currency();
t1.credit_card();
t1.debit_card();
t1.e_wallet();
t1.physical_wallet();
	
	
	
	
}
}
