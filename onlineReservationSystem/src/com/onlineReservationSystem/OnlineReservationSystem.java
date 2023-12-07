package com.onlineReservationSystem;
	import java.util.Scanner;

	public class OnlineReservationSystem {
	    private static String username = "admin";
	    private static String password = "admin123";
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Welcome to the Online Reservation System");
	        
	        // Login module
	        boolean loggedIn = false;
	        while (!loggedIn) {
	            System.out.print("Enter username: ");
	            String enteredUsername = scanner.nextLine();
	            
	            System.out.print("Enter password: ");
	            String enteredPassword = scanner.nextLine();
	            
	            if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
	                System.out.println("Login successful!");
	                loggedIn = true;
	            } else {
	                System.out.println("Invalid username or password. Please try again.");
	            }
	        }
	        
	        // Reservation module
	        System.out.println("\n--- Reservation Form ---");
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        
	        System.out.print("Enter train number: ");
	        int trainNumber = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character
	        
	        // Additional fields can be added here based on your requirements
	        
	        System.out.print("Enter date of journey: ");
	        String dateOfJourney = scanner.nextLine();
	        
	        System.out.print("Enter source station: ");
	        String sourceStation = scanner.nextLine();
	        
	        System.out.print("Enter destination station: ");
	        String destinationStation = scanner.nextLine();
	        
	        // Save the reservation details to the database or perform further processing
	        
	        System.out.println("\nReservation successful! Thank you for using our system.");
	        
	        // Cancellation module
	        System.out.println("\n--- Cancellation Form ---");
	        System.out.print("Enter PNR number: ");
	        String pnrNumber = scanner.nextLine();
	        
	        // Fetch the reservation details from the database based on the provided PNR number
	        
	        // Display the reservation details
	        
	        System.out.print("Do you want to confirm the cancellation? (yes/no): ");
	        String confirmCancellation = scanner.nextLine();
	        
	        if (confirmCancellation.equalsIgnoreCase("yes")) {
	            // Perform cancellation and update the database
	            
	            System.out.println("Cancellation confirmed. Your ticket has been cancelled.");
	        } else {
	            System.out.println("Cancellation not confirmed. Your ticket has not been cancelled.");
	        }
	        
	        scanner.close();
	    }
	}

