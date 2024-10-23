package assignments;

public class Assignments34_Part_of_Array_or_Not {

	public static void main(String[] args) {
		
		String str[]= {"Pen", "Pencils", "Box"};
		String strcheck= "Pen";
		
		Boolean ispartArray= isstrArray(str, strcheck);
		
		System.out.println(ispartArray);
		
		
	}

	private static Boolean isstrArray(String[] str, String strcheck) {
		
		for(String element : str) {
			if(element ==strcheck) {
				System.out.println("Array is present");
			}
		}
		return true;
	}
}
