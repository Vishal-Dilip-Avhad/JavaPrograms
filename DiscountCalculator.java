package basicprogramming;

import java.util.Scanner;

public class DiscountCalculator {
	    public static void main(String[] args) {
	        // Create a Scanner object for input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for the total purchase amount
	        System.out.print("Enter the total purchase amount: $");
	        double purchaseAmount = scanner.nextDouble();

	        // Prompt the user for membership status
	        System.out.print("Are you a member? (yes/no): ");
	        String membershipStatus = scanner.next().toLowerCase();

	        // Variable to store the discount rate
	        double discountRate = 0.0;

	        // Determine the discount rate based on membership status and purchase amount
	        if (membershipStatus.equals("yes")) {
	            if (purchaseAmount >= 100) {
	                discountRate = 0.20; // 20% discount for members
	            } else {
	                discountRate = 0.10; // 10% discount for members
	            }
	        } else if (membershipStatus.equals("no")) {
	            if (purchaseAmount >= 200) {
	                discountRate = 0.15; // 15% discount for non-members
	            } else {
	                discountRate = 0.05; // 5% discount for non-members
	            }
	        } else {
	            System.out.println("Invalid membership status entered.");
	            scanner.close();
	            return;
	        }

	        // Calculate the discount amount
	        double discountAmount = purchaseAmount * discountRate;

	        // Calculate the final amount after discount
	        double finalAmount = purchaseAmount - discountAmount;

	        // Display the discount and final amount
	        System.out.printf("Discount: $%.2f\n", discountAmount);
	        System.out.printf("Final amount after discount: $%.2f\n", finalAmount);

	        // Close the scanner
	        scanner.close();
	    }
	}


