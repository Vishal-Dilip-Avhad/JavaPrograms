package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignments73 
{
	public static void main(String[] args) 
	{
		try
		{
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enter the value of array size");
	int size=	s1.nextInt();
		int []rollno=new int[size];
		rollno[0]=78;
		rollno[1]=97;
		rollno[2]=96;
		}
		catch(NegativeArraySizeException a1)
		{
			System.out.println("The array size can only be positive numeric value, please enter correct value");
			Scanner s1=new Scanner(System.in);
			int size=	s1.nextInt();
		    int []rollno=new int[size];	
		}
		catch(ArrayIndexOutOfBoundsException a2)
		{
			System.out.println("Size of your array is less, please increase it");
			Scanner s1=new Scanner(System.in);
			int size=	s1.nextInt();
			int []rollno=new int[size];	
		}
		catch(InputMismatchException a3)
		{
			System.out.println("The array size can only be positive numeric value, please enter correct value");
			Scanner s1=new Scanner(System.in);
			int size=	s1.nextInt();
			int []rollno=new int[size];	
		}
		finally
		{
			System.out.println("close the connection with Database");
		}
		
	}
}
