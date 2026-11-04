import java.util.*;

public class Exsersize2 {

	public static void main(String[] args) {

		Random rndGen = new Random();
		int[] randomNumbers = new int[15];
		int[] divisablesByFive = new int[randomNumbers.length];

		for (int i = 0; i < divisablesByFive.length; i++) {
			divisablesByFive[i] = 0;
		}

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
				divisablesByFive[divisableBy5] = 5;
				divisableBy5++;
			}
		}

		System.out.print("\nThere are " + divisableBy5 + " numbers divisable by 5. \nAt the indexes: ");
		
		for (int i = 0; i < divisablesByFive.length; i++) {
			if (divisablesByFive[i] == 5) {
				if (i > 0) {
					System.out.print(", " + i);
					} else {
						System.out.print(i);
					}
				
			}
		}
	}
}
