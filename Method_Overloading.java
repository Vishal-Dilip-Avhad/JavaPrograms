package basicprogramming;

public class Method_Overloading {
	
	static void amazonLogin(String username, String pwd) {
		System.out.println(username);
		System.out.println(pwd);
	}
	static void amazonLogin(long pin, int OTP) {
		System.out.println(pin);
		System.out.println(OTP);
	}
	//--------------------------------------------------------------------//
	static void store(String address, int pin, int total_employees) {
		System.out.println(address);
		System.out.println(pin);
		System.out.println(total_employees);
	}
//----------------------------------------------------------------------------//	
	public static void main(String[] args) {
		Method_Overloading m1= new Method_Overloading();
		m1.amazonLogin("vishal123", "password");
		m1.amazonLogin(9922, 4566856);
		m1.store("76,lane no 4, sat col pune", 414556, 4);

	}

}
