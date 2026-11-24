import java.util.Scanner;

public class DevourString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter some text: ");
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
		
		thePoorString = thePoorString + " ";//seems to make work easier
		
		int wordCount = 0;
		for (int i = 0; i < thePoorString.length(); i++) {
			if (thePoorString.charAt(i) == ' ') {
				wordCount++;
			}
		}

		System.out.println("Number of words: " + wordCount);
		
		String[] words = new String[wordCount];
		int endIndex = thePoorString.indexOf(' ');
		for (int i = 0; i < words.length; i++) {
			words[i] = thePoorString.substring(0, endIndex);
			thePoorString = thePoorString.substring(endIndex + 1, thePoorString.length());
			endIndex = thePoorString.indexOf(' ');
		}
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(i + ": " + words[i] + "!");
		}
		System.out.println("First word:" + words[0] + " Last Word: " + words[words.length-1]);
		
		String middleWord = "";
		if (words.length % 2 == 0) {
			//0123
			middleWord = words[(words.length/2) -1] + " "  + words[(words.length/2)];
		} else {
			middleWord = words[words.length/2];
		}
		
		System.out.println("Middle Words: " + middleWord);

		String acronym = "";
		for (int i = 0; i < words.length; i++) {
			acronym += words[i].charAt(0);
		}
		System.out.println("Acronym of the words: " + acronym);
	}
}
