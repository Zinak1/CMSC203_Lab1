
import java.util.Scanner; // Needed for the Scanner class

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object Movie
		Movie myMovie = new Movie();
		//Create a scanner object for keyboard input
		Scanner keyboard = new Scanner (System.in);
		//Prompt the user to enter the name of the movie
		System.out.println ("Enter the name of the movie");
		//Read the user's input
		//title = keyboard.nextLine();
		myMovie.setTitle(keyboard.nextLine());
		//Prompt the user to enter the rating of the movie
		System.out.println ("Enter the rating of the movie");
		//Read the user's input
		//rating = keyboard. nextInt (); 
		myMovie.setRating(keyboard.nextLine());
		//Prompt the user to enter the soldTicket
		System.out.println ("Enter the number of tickets sold for this movie");
		//Read the user's input
		//soldTicket= keyboard.nextInt();
		myMovie.setSoldTickets( keyboard. nextInt ());
		//System.out.println("Goodbye"); 
		System.out.println("consussion("+myMovie.getRating()+"): Tickets Sold: "+ myMovie.getSoldTickets());
		System.out.println("Do you want to enter another( y or n)");
		//Using next().charAt(0) to Accept Char Input
		char c= keyboard.next().charAt(0);
		while (c=='y' || c=='Y') {
			
			System.out.println("Enter the name of a movie");
			myMovie.setTitle(keyboard.nextLine());
			myMovie.setTitle(keyboard.nextLine());
			System.out.println("Enter the rating of movie");
			myMovie.setRating(keyboard.nextLine());
			myMovie.setRating(keyboard.nextLine());
			System.out.println("Enter number of tickets sold for this movie");
			myMovie.setSoldTickets(keyboard.nextInt());
			System.out.println("consussion("+ myMovie.getRating()+ "): Tickets Sold: "+ myMovie.getSoldTickets());
			System.out.println("Do you want to enter another? (y or n)");
			c= keyboard.next().charAt(0);
		}
		System.out.println("Good bye");
	}
}
