import java.util.Scanner;

public class wordArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the number of words you're planning to enter: ");
		int wordCount = scn.nextInt();
		
		String[] words = new String[wordCount];
		
		System.out.print("\nEnter the words sire: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = scn.next();
		}
		System.out.println();
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		

	}

}
