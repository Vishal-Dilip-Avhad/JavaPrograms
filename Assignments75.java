package assignments;


class flipkart{
	
	void mobile() {
		this.laptop();
		System.out.println("Iphone");
	}
	void cloth() {
		this.headphone();
		System.out.println("Zara");
	}
	void laptop() {
		System.out.println("Dell");
	}
	void headphone() {
		this.mobile();
		System.out.println("Boat");
	}
}

public class Assignments75 extends flipkart{

	public static void main(String[] args) {
		
		Assignments75 s1 = new Assignments75();
		s1.cloth();
	}
}
