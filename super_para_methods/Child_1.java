package super_para_methods;

public class Child_1 extends Super_2{


	void play(String A, String B, String C) {
		super.play(A,B);
		
		C="Anthony";
		
		System.out.println(C);
	}
	
	public static void main(String[] args) {
		
		Child_1 d1 = new Child_1();
		d1.play( "A", "C", "B");
		
	}
}
