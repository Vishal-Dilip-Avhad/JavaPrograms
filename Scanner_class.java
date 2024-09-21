package basicprogramming;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
//---------------------------------------------------------//
		//area of circle
		System.out.println("finding area of circle");
		System.out.println("value of pi");
	    double  pi=s1.nextDouble();
	    System.out.println("value of radius");
	    double r = s1.nextDouble();
	    double area = pi*r*r;
	    System.out.println("area of circle-->"+area);
 //-------------------------------------------------------------------//
		//circumference of circle
	    System.out.println("finding circumference of circle");
	    System.out.println("value of pi");
	    double  pi1=s1.nextDouble();
	    System.out.println("value of radius");
	    double R = s1.nextDouble();
	    double circumference = pi1*R*2;
	    System.out.println("circumference of circle-->"+circumference);
 //--------------------------------------------------------------------//
	    //Area of traingle
	    System.out.println("finding area of traingle");
	    System.out.println("value of base in cm");
	    int base = s1.nextInt();
	    System.out.println("value of height in cm");
	    int height = s1.nextInt();
	    double Area_of_Traingle = 0.5*base*height;
	    System.out.println("area of traingle--->"+Area_of_Traingle);
//------------------------------------------------------------------------------//
	    //area of square
	    System.out.println("finding are of sqaure");
	    System.out.println("value of side");
	    double side=s1.nextDouble();
	    double area_of_square = side*side;
	    System.out.println("area of sqaure---."+area_of_square);
	    
//---------------------------------------------------------------------------------//
	    //area of rectangle
	    System.out.println("finding area of rectangle");
	    System.out.println("value of lenght");
	    double lenght=s1.nextDouble();
	    System.out.println("value of bredth");
	    double breadth=s1.nextDouble();
	    double area_of_rectangle=lenght*breadth;
	    System.out.println("area of rectangle---->"+area_of_rectangle);
	   
	    
	}

	
}
