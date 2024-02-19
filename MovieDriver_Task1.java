// Task 1:

import java.util.Scanner;

public class MovieDriver_Task1 {    
	
	public static void main(String[] args) {    
		
		Scanner scanner = new Scanner(System.in);            
		
	// Ask the user to enter movie details        
		System.out.println("Enter the details of the movie:");    
		
	// Create a movie object        
		Movie movie = new Movie();             
	
	// Ask the user to enter the title of the movie   
		System.out.print("Enter the title: ");       
		String title = scanner.nextLine();       
		movie.setTitle(title);          
	
	// Ask the user to enter the rating of the movie    
		System.out.print("Enter the rating: ");     
		String rating = scanner.nextLine();      
		movie.setRating(rating);           
	
	// Ask the user to enter the number of tickets sold     
		System.out.print("Enter the number of tickets sold: ");  
		int soldTickets = scanner.nextInt();      
		movie.setSoldTickets(soldTickets);          
		
	// Print out the movie info     
		System.out.println(movie.toString());         
		
		scanner.close();   
		}
	}
