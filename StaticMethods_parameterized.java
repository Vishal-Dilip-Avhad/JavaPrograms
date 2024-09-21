package basicprogramming;

public class StaticMethods_parameterized {
	

	static void division() {
		int a= 10;
		int b= 5;
		int z=a/b;
		System.out.println(z);
	}
	static void modulus() {
		int a=50;
		int b=10;
		int z=a/b;
		System.out.println(z);
	}
	static void m1() {
		byte a=127;
		byte b=-127;
		byte c= (byte) (a+b);
		System.out.print("result is-- "+c);
	}
//------------------------------------------------------------------//
	static void multiplication(double a, double b) {
		double c=a*b;
		System.out.println(c);
	}
	static void addition(long a, long b) {
		long c= a+b;
		System.out.println(c);
		
	}
	static void data(String a, char b, boolean c) {
		String d = a+b+c;
		System.out.print(d);
	}
	//---------------------------------------------------------------------//
	public static void main(String[] args) {
		division();
		modulus();
		multiplication(8.5, 9.5);
		addition(111, 222);
		data("vishal ", 'A', false);
		m1();
	}

}
