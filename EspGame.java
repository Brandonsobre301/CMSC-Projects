import java.util.Scanner;

public class EspGame {
    // Constants for colors
    static final String RED = "Red";
    static final String GREEN = "Green";
    static final String BLUE = "Blue";
    static final String ORANGE = "Orange";
    static final String YELLOW = "Yellow";
    static final String PURPLE = "Purple";
    static final String PINK = "Pink";

    // Method to get color name based on the color index
    public static String getColorName(int index) {
        switch (index) {
            case 0:
                return RED;
            case 1:
                return GREEN;
            case 2:
                return BLUE;
            case 3:
                return ORANGE;
            case 4:
                return YELLOW;
            case 5:
                return PURPLE;
            case 6:
                return PINK;
            default:
                return "Invalid color";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();

        // Display user information
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);

        // Initialize variables
        int correctGuesses = 0;
        final int NUM_ROUNDS = 11;

        // Run the game
        for (int i = 1; i <= NUM_ROUNDS; i++) {
            // Generate a random number to select a color
            int randomNum = (int) (Math.random() * 7);

            // Display the color options
            System.out.println("\nGuess the color:");
            for (int j = 0; j < 7; j++) {
                System.out.println(j + ". " + getColorName(j));
            }

            // Prompt user for input and validate
            int userGuess;
            do {
                System.out.print("Enter your guess (0-6): ");
                // Check if user input is an integer
                while (!scanner.hasNextInt()) {
                	// Inform the user about invalid input
                	System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
                userGuess = scanner.nextInt();
            } while (userGuess < 0 || userGuess > 6);

            // Display the randomly selected color
            System.out.println("The randomly selected color is: " + getColorName(randomNum));

            // Check if the user guessed correctly
            if (userGuess == randomNum) {
                System.out.println("Correct!\n");
                // Increment and keep track of how many times the user correctly guessed the color
                correctGuesses++;
            } else {
                System.out.println("Incorrect. Better luck next time!\n");
            }
        }

        // Display the total number of correct guesses
        System.out.println("You guessed the correct color " + correctGuesses + " times out of " + NUM_ROUNDS + " rounds.");

        // Close the scanner
        scanner.close();
    }
}
