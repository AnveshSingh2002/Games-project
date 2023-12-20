// Importing necessary packages
package game;
import java.util.*;

// Main class for the Snake and Ladder game
public class SnakeAndLadder {
	
	// Method to simulate the rolling of a dice
	static int flipDice(int count) {
		
		// Creating a Random object to generate random numbers
		Random rd = new Random();
		// Generating a random number between 1 and 6 to simulate a dice roll
		int score = rd.nextInt(6) + 1;
		
		// Printing the score obtained from the dice roll
		System.out.println("You scored from this flip: " + score);
		
		// Updating the player's position on the board if they haven't reached the maximum position (100)
		if(count + score <= 100)
			count = count + score;
		
		// Using a switch statement to handle special positions on the board (ladders and snakes)
		switch(count) {
			// Ladders - moving forward
			case 1: count = 38;
				System.out.println("Ladder: Climb up to " + count);
				break;
			case 4: count = 14;
				System.out.println("Ladder: Climb up to " + count);
				break;
			case 9: count = 31;
				System.out.println("Ladder: Climb up to " + count);
				break;
			case 21: count = 42;
				System.out.println("Ladder: Climb up to " + count);
				break;
			case 28: count = 84;
				System.out.println("Ladder: Climb up to " + count);
				break;
			case 51: count = 67;
				System.out.println("Ladder: Climb up to " + count);
				break;
			case 72: count = 91;
				System.out.println("Ladder: Climb up to " + count);
				break;
			case 80: count = 99;
				System.out.println("Ladder: Climb up to " + count);
				break;
			// Snakes - moving backward
			case 17: count = 7;
				System.out.println("Snake: Slide down to " + count);
				break;
			case 54: count = 34;
				System.out.println("Snake: Slide down to " + count);
				break;
			case 63: count = 18;
				System.out.println("Snake: Slide down to " + count);
				break;
			case 64: count = 60;
				System.out.println("Snake: Slide down to " + count);
				break;
			case 87: count = 36;
				System.out.println("Snake: Slide down to " + count);
				break;
			case 93: count = 73;
				System.out.println("Snake: Slide down to " + count);
				break;
			case 95: count = 75;
				System.out.println("Snake: Slide down to " + count);
				break;
			case 98: count = 79;
				System.out.println("Snake: Slide down to " + count);
				break;
		}
		
		// Printing the total score of the player after the dice roll and any movement on the board
		System.out.println("Your total score: " + count);
		return count;
	}

	// Main method where the game is initialized and played
	public static void main(String[] args) {
		// Creating a Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		// Getting names of the players
		System.out.println("Enter the first player's name");
		String fname = sc.next();
		System.out.println("Enter the second player's name");
		String sname = sc.next();
		
		// Initializing scores for both players
		int fcount = 0, scount = 0;
		
		// Game loop
		while(true) {
			// First player's turn
			System.out.println(fname + ", press any button to roll the dice");
			sc.next();
			fcount = flipDice(fcount);
			
			// Checking if the first player has won
			if(fcount == 100) {
				System.out.println(fname + " won the game!");
				break;
			}
			
			// Displaying a separator between turns
			System.out.println("============================================");
			
			// Second player's turn
			System.out.println(sname + ", press any button to roll the dice");
			sc.next();
			scount = flipDice(scount);
			
			// Checking if the second player has won
			if(scount == 100) {
				System.out.println(sname + " won the game!");
				break;
			}
			
			// Displaying a separator between turns
			System.out.println("==================================");
		}
		
		// Closing the Scanner object to prevent resource leak
		sc.close();
	}
}
