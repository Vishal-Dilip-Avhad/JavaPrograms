package assignments;

public class Negative_array_size_exception {

	public static void main(String[] args) {
		
	
	int array[] = new int[-3];
	array[0]=100;
	array[1]=150;
	array[2]=200;
	
	System.out.println(array[1]);
 }
}
