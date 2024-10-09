package assignments;

public class Array_index_out_of_bound_exception {

	public static void main(String[] args) {
		int array[] = new int[3];
		array[0]=100;
		array[1]=150;
		array[2]=200;
		array[3]=250;
		
		System.out.println(array[3]);
		
	}
}
