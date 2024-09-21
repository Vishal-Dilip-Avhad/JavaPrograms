package basicprogramming;
import java.util.Scanner;

public class mixed_keywords {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        while (true) {
	            // Display menu
	            System.out.println("Menu:");
	            System.out.println("1. Add");
	            System.out.println("2. Subtract");
	            System.out.println("3. Multiply");
	            System.out.println("4. Divide");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            // Read user input
	            choice = scanner.nextInt();

	            // Using switch to handle different choices
	            switch (choice) {
	                case 1:
	                    System.out.println("You chose to Add.");
	                    
	                    System.out.println("enter first number");
	                    int x=scanner.nextInt();
	                    
	                    System.out.println("enter second number");
	                    int y= scanner.nextInt();
	                    System.out.println("addition is---"+x+y);
	              
	                    break; // Exit switch block

	                case 2:
	                    System.out.println("You chose to Subtract.");
	                    // Logic for subtraction can go here
	                    break; // Exit switch block

	                case 3:
	                    System.out.println("You chose to Multiply.");
	                    // Logic for multiplication can go here
	                    break; // Exit switch block

	                case 4:
	                    System.out.println("You chose to Divide.");
	                    // Logic for division can go here
	                    break; // Exit switch block

	                case 5:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    System.exit(0); // Exit the program

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    // Here, you could use `continue` to skip the rest of the loop iteration.
	                    continue; // Go to the next iteration of the loop
	            }
	        }
	    }
	}


