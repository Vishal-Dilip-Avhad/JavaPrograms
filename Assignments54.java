package assignments;

public class Assignments54{

	public void add() {
		System.out.println("public AS");
	}
     void sub() {  //default/package
		System.out.println("default AS");
	}
    protected void mul() {
	System.out.println("protectred AS");
   }
    private void div() {
    System.out.println("private AS");
	
    }
    public static void main(String[] args) {
		Assignments54 a1 = new Assignments54();
		a1.add();
		a1.mul();
		a1.sub();
		a1.div();
	}
}
