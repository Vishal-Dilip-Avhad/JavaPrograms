package this_calling;

// this calling by parameterized constructor

public class This_Para {

	This_Para(Double D){
		this(44);
		System.out.println("Hi");
	}
	
	This_Para(int a){
		this('X',"str");
		System.out.println("by");
	}
	
	This_Para(int a, String b){
		
		System.out.println("completly byyyy");
	}
	
	This_Para(char a, String b){
		this(99,"vishal");
		System.out.println("byyyy");
	}
	
	public static void main(String[] args) {
		new This_Para(5.5);
	}
}
