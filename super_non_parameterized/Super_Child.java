package super_non_parameterized;

public class Super_Child extends Super_Parent_NonPara{

	void IPL() {
		super.T20_Match();
		
		String format= "combination of all country player";
		String rules= "1 extra run for no ball";
		System.out.println("Format-"+ format+"Rules-"+ rules);
	}
	
	public static void main(String[] args) {
		
		Super_Child c1 = new Super_Child();
		c1.IPL();
		
	}
}
