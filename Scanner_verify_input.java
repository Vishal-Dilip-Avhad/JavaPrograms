package basicprogramming;
import java.util.Scanner;


public class Scanner_verify_input {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number = 0;
	        boolean valid = false;

	        while (!valid) {
	            System.out.print("Enter an integer: ");
	            if (scanner.hasNextInt()) {
	                number = scanner.nextInt();
	                valid = true; // Input is valid
	            } else {
	                System.out.println("Invalid input. Please enter a valid integer.");
	                scanner.next(); // Clear the invalid input
	            }
	        }

	        System.out.println("You entered: " + number);
	        scanner.close();
	    }
	}


