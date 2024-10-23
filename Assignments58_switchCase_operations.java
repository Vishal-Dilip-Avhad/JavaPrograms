package assignments;
import java.util.Scanner;
public class Assignments58_switchCase_operations {
	
 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	       
	        System.out.print("Choose operation (1: Add, 2: Subtract, 3: Multiply, 4: Divide): ");
	        int choice = scanner.nextInt();

	        double result;

	         switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Addition: " + result);
	                break;
	            case 2:
	                result = num1 - num2;
	                System.out.println("Subtraction: " + result);
	                break;
	            case 3:
	                result = num1 * num2;
	                System.out.println("Multiplication: " + result);
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Division: " + result);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Invalid choice! Please select a valid operation.");
	        }
	        scanner.close();
	    }
	}


