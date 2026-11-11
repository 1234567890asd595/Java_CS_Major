import java.util.Scanner;

public class largestDigit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int theNumber;
		System.out.print("Enter a number: ");
		theNumber = scn.nextInt();

		int biggestDigit = 0;
		while (theNumber != 0) {
			int digit =  theNumber % 10;
			if (digit > biggestDigit) {	
				biggestDigit = digit;
			}
			theNumber = theNumber / 10;
		}
		System.out.println(biggestDigit);
	}

}
