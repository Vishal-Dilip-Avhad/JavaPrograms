package assignments;

//assignment22
	abstract class WagonX
	{
	   public abstract void model();
	   public abstract void color();
	   public static void baseEngine()
	    {
	   int baseEngin = 1200;
	   System.out.println(baseEngin);
	    }
	   public static void size()
	   {
	   System.out.println("Size-18 meter");
	   }
	}
	class Car extends WagonX
	{
	public void model()
	{
	System.out.println("SUVGT200");
	}
	public void color()
	{
	System.out.println("Red");
	}
	}
	
	public class Abstract_Class_Concrete_Class {
	public static void main(String[] args) {
		Car c1= new Car();
		c1.size();
		c1.color();
		c1.model();
		c1.baseEngine();
		

	}

}
