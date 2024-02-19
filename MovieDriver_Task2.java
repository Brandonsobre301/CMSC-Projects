// Task 2:

import java.util.Scanner;

public class MovieDriver_Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         // Loop to read input for multiple movies
        	boolean continueInput = true;
        	while (continueInput) {
         
         // Prompt user to enter movie details
            System.out.println("Enter the details of the movie:");
            
         // Create a new movie object
            Movie movie = new Movie();
            
         // Prompt user to enter the title of the movie
            System.out.print("Enter the title: ");
            String title = scanner.nextLine();
            movie.setTitle(title);
            
         // Prompt user to enter the rating of the movie
            System.out.print("Enter the rating: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);
            
         // Prompt user to enter the number of tickets sold
            System.out.print("Enter the number of tickets sold: ");
            int soldTickets = scanner.nextInt();
            movie.setSoldTickets(soldTickets);
            
         // Print out the movie information
            System.out.println(movie.toString());
            
         // Ask user if they want to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String input = scanner.next();
            if (!input.equalsIgnoreCase("yes")) {
                continueInput = false;
                
            }
            
          // Dummy newline character
            scanner.nextLine();
        }
        
        scanner.close();
    }
}
