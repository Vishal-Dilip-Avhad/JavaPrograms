package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignments33_Array_runtime {

	public static void main(String[] args) {
		
		System.out.println("enter 3 digits");
		Scanner scan = new Scanner(System.in);
		
		int a1[]= new int[3];
		a1[0]=scan.nextInt();
		a1[1]=scan.nextInt();
		a1[2]=scan.nextInt();
		
		System.out.println(Arrays.toString(a1));
		
	}
}
