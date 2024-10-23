package assignments;
import java.util.Scanner;

public class Assignments59 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        String[] stringArray = inputString.split(" "); // Split by space

	        System.out.println("The resulting array is:");
	        for (String str : stringArray) {
	            System.out.println(str);
	        }
	        
	        scanner.close();
	    
	}

}
