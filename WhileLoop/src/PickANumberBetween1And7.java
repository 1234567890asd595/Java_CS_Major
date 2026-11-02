import java.util.*;

public class PickANumberBetween1And7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 7!");
		System.out.println("Do NOT enter a number that is not in that range!");
		
		int guessedNumber = 0;
		while (guessedNumber < 1 || guessedNumber > 7) {
			System.out.print("Enter a number: ");
			guessedNumber = scn.nextInt();
		}
		System.out.println("Good gracious! You finally guessed a valid number! שכויח");
		
	}

}
