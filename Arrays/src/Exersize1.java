import java.util.*;

public class Exersize1 {
	public static void main(String[] args) {
		Random randNumGen = new Random();
		final int Length_OF_BASE_ARRAY = 20000;
		int[] randomNumbers = new int[Length_OF_BASE_ARRAY];
		int[] ThirtySevens = new int[Length_OF_BASE_ARRAY];
	
		
		
		for (int i = 0; i < Length_OF_BASE_ARRAY ; i++) {
			ThirtySevens[i] = -1;
		}

		for (int i = 0; i < Length_OF_BASE_ARRAY ; i++) {
			randomNumbers[i] = randNumGen.nextInt(99)+1;
			if (randomNumbers[i] == 37) {
				ThirtySevens[i] = i;
			}
		}

		for (int i = 0; i < Length_OF_BASE_ARRAY; i++) {
			System.out.print(randomNumbers[i] + " ");
		}

		System.out.print("\n And there were 37s in the indexes: ");
		int ThirtySevenNumOfOccourances = 0;
		for (int i = 0; i < Length_OF_BASE_ARRAY; i++) {
			if (ThirtySevens[i] >= 0) {
				System.out.print(i + ", ");
				ThirtySevenNumOfOccourances++;
			}


		}
		System.out.println("\n Which is " + ThirtySevenNumOfOccourances + " times.");
	}

}
