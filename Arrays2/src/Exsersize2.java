import java.util.*;

public class Exsersize2 {

	public static void main(String[] args) {

		Random rndGen = new Random();
		int[] randomNumbers = new int[15];
		int[] divisablesByFive = new int[randomNumbers.length];
		int[] numbersBetweenFouryAndSixty = new int[randomNumbers.length];

		//init divisables by 5 array
		for (int i = 0; i < divisablesByFive.length; i++) {
			divisablesByFive[i] = -1;
		}
		
		for (int i = 0; i < numbersBetweenFouryAndSixty.length; i++) {
			numbersBetweenFouryAndSixty[i] = -1;
		}
		
		// init random number array
		for (int i = 0; i < randomNumbers.length; i++) {
			
			int rndNum = rndGen.nextInt(99) + 1;
			while (rndNum % 2 == 0) {
				rndNum = rndGen.nextInt(99) + 1;
			}
			
			randomNumbers[i] = rndNum;
		}

		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.print(randomNumbers[i] + " ");
		}

		int divisableBy5 = 0;
		for (int i = 0; i < randomNumbers.length; i++) {
			if (randomNumbers[i] % 5 == 0) {
				divisablesByFive[divisableBy5] = i;
				divisableBy5++;
			}
		}

		System.out.print("\nThere are " + divisableBy5 + " numbers divisable by 5. \nAt the indexes: ");
		
		for (int i = 0; i < divisablesByFive.length; i++) {
			if (divisablesByFive[i] >= 0) {
				if (i > 0) {
					System.out.print(", " + divisablesByFive[i]);
					} else {
						System.out.print(divisablesByFive[i]);
					}
				
			}
		}
		System.out.println("\n");

		int betweenFouryAndSixty = 0;
		for (int i = 0; i < randomNumbers.length; i++) {
			if (randomNumbers[i] > 40 && randomNumbers[i] < 60) {
				numbersBetweenFouryAndSixty[betweenFouryAndSixty] = i;
				betweenFouryAndSixty++;
			}
		}

		System.out.print("\nThere are " + betweenFouryAndSixty + " numbers between fourty and sixty. \nAt the indexes: ");
		
		for (int i = 0; i < numbersBetweenFouryAndSixty.length; i++) {
			if (numbersBetweenFouryAndSixty[i] >= 0) {
				if (i > 0) {
					System.out.print(", " + numbersBetweenFouryAndSixty[i]);
					} else {
						System.out.print(numbersBetweenFouryAndSixty[i]);
					}
				
			}
		}
		System.out.println("");
	}
}
