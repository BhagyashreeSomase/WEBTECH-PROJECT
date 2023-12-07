package com.numberGuessingGame;

import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame {
	
	    public static void main(String[] args) {
	        int rangeStart = 1;
	        int rangeEnd = 100;
	        int maxAttempts = 5;
	        int round = 1;
	        int score = 0;

	        JOptionPane.showMessageDialog(null, "Welcome to Guess the Number game!");

	        while (true) {
	            JOptionPane.showMessageDialog(null, "Round " + round);

	            // Generate random number
	            int randomNumber = generateRandomNumber(rangeStart, rangeEnd);

	            int attempts = 0;
	            boolean guessedCorrectly = false;

	            while (attempts < maxAttempts) {
	                String guessString = JOptionPane.showInputDialog("Enter your guess (between " + rangeStart + " and " + rangeEnd + "):");

	                // Validate user input
	                int guess;
	                try {
	                    guess = Integer.parseInt(guessString);
	                } catch (NumberFormatException e) {
	                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
	                    continue;
	                }

	                attempts++;

	                if (guess == randomNumber) {
	                    guessedCorrectly = true;
	                    break;
	                } else if (guess < randomNumber) {
	                    JOptionPane.showMessageDialog(null, "Too low! Try again.");
	                } else {
	                    JOptionPane.showMessageDialog(null, "Too high! Try again.");
	                }
	            }

	            if (guessedCorrectly) {
	                score += maxAttempts - attempts + 1;
	                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts.");
	            } else {
	                JOptionPane.showMessageDialog(null, "Out of attempts! The number was " + randomNumber + ".");
	            }

	            // Ask if the user wants to play another round
	            int playAgain = JOptionPane.showConfirmDialog(null, "Do you want to play another round?", "Play Again", JOptionPane.YES_NO_OPTION);
	            if (playAgain == JOptionPane.YES_OPTION) {
	                round++;
	            } else {
	                break;
	            }
	        }

	        JOptionPane.showMessageDialog(null, "Game over! Your total score is " + score + ".");
	    }

	    // Generate a random number between the given range
	    private static int generateRandomNumber(int start, int end) {
	        Random random = new Random();
	        return random.nextInt(end - start + 1) + start;
	    }
}
