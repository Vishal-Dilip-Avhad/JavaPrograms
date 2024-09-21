package basicprogramming;

public class Math_class {
	
	

	public static void main(String[] args) {
		
		System.out.println(Math.addExact(200, 500));
		System.out.println(Math.addExact(456445621, 44556446213l));
		System.out.println(Math.subtractExact(500, 400));
		System.out.println(Math.multiplyExact(44, 55));
		
		System.out.println(Math.max(444, 555));
		System.out.println(Math.max(55.55, 66.66));
		System.out.println(Math.min(44, 55));
		
		System.out.println(Math.abs(-88));
		System.out.println(Math.random());    //0to 1 of double data types
		
		double pivalue =Math.PI;
		System.out.println(pivalue);
		
		double value= Math.toDegrees(4);
		System.out.println(value);
		
		

	}

}
