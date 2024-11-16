package assignments;

class Birds{
	void sound() {
		System.out.println("oo boo moo ");
	}
}

class Flemingo extends Birds{
	void property() {
		System.out.println("smallest bird");
	}
	void soundFlemingo() {
		System.out.println("kooo");
	}
}



public class Assignments76 {

	public static void main(String[] args) {
	
	    Birds b1 = new Flemingo();   //upcasting only parent class properties can call
	    b1.sound();
	    
	    Flemingo f1 = (Flemingo) b1;  //both parent and child class prop can call if you override child class will run
	    f1.property();
	    f1.sound();
	    f1.soundFlemingo();
	    
	}
}
//converting child class object into parent class