package assignments;


    class parent {      //parent class
		
		static void property() {
			System.out.println("8 acres land");
			System.out.println("Home");
			System.out.println("Car");
		}
		static void cash() {
			System.out.println("10 lacks");
		}
	}
	
	public class Child_Single_Level_Inheritance_Static extends parent{    //child sub class
		
		static void myproperty() {
			System.out.println("bike");
			System.out.println("iphone");
		}
		static void mycash() {
			System.out.println("1 lacks");
		}
		
		public static void main(String[] args) {
			property();
			cash();
			
			myproperty();
			mycash();
		}
	}


