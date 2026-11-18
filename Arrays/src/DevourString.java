import java.util.Scanner;

public class DevourString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String thePoorString = scn.nextLine();
		
		char firstLetter = thePoorString.charAt(0);
		char lastLetter = thePoorString.charAt(thePoorString.length() - 1);
		
		System.out.println("First letter: " + firstLetter + ", last letter: " + lastLetter);
		
		String middleOfString = "";
		if (thePoorString.length() % 2 == 0) {
			middleOfString = thePoorString.substring((thePoorString.length()/2) - 1, (thePoorString.length()/2) + 1);
		} else {
			middleOfString = thePoorString.substring(thePoorString.length()/2, thePoorString.length()/2 + 1);
		}
		
		System.out.println("Middle: " + middleOfString);
		int startIndex = 0;
		int endIndex = thePoorString.indexOf(' ');
		thePoorString = thePoorString + " ";
		while (thePoorString.indexOf(' ') >= 0) {
			
		}
	}
}
