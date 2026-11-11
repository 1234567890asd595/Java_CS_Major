import java.util.Random;

public class separateNumberToDigits {

	public static void main(String[] args) {
		Random rndGen = new Random();

		int randomNumber = rndGen.nextInt(90000) + 10000;//ליצור מספר 5 ספרתי אקראי

		System.out.println(randomNumber);

		int[] digits = new int[5];

		int i = 0;
		while (randomNumber != 0) {
			int digit = randomNumber % 10; 
			digits[i] = digit;
			System.out.println(digit);
			i++;
			randomNumber = randomNumber / 10;
		}
		boolean isThereOne = false;
		for (int j = 0; j < digits.length; j++) {
			isThereOne = digits[j] == 1;
		}
		if (isThereOne) {
			System.out.println("You have a one!");
		} else {
			System.out.println("You don't have a one.");
		}
	}

}
