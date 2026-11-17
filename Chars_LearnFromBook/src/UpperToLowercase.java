import java.util.Scanner;

public class UpperToLowercase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		/*
		 * upper - 65 - 90
		 * lower 97 - 122
		 * upper => lower so then just add 32
		 * */
		System.out.println("Enter uppercase letter: ");
		char uppercase = scn.next().charAt(0);
		char lowercase = (char)((int)uppercase + 32);
		System.out.println("The lowercase counter-pair: " + lowercase);
		

	}

}
