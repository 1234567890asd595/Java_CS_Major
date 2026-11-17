import java.util.Random;

public class LongJump {
	public static void main(String[] args) {

		Random rndGen = new Random();

		double[][] scores = new double[5][3];

		double maxJumpLength = 3.1415926;//because i can, it could just as much be any other double that's smaller than 6.
		int maxJumpIndex = -1;

		double maxAvgJumpLength = 0;
		int maxAvgJumpIndex = -1;

		for (int i = 0; i < 5; i++) {
			double avg = 0;
			for (int j = 0; j < 3; j++) {
				scores[i][j] = rndGen.nextDouble() + 6;
				avg += scores[i][j];
				if (scores[i][j] > maxJumpLength) {
					maxJumpLength = scores[i][j];
					maxJumpIndex = i;
				}
			}
			avg /= 3;
			if (avg > maxAvgJumpLength) {
				maxAvgJumpLength = avg;
				maxAvgJumpIndex = i;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(roundToThree(scores[i][j]) + "	");
			}
			System.out.println();
		}
		System.out.println("max length:" + roundToThree(maxJumpLength) + ", player num: " + maxJumpIndex);
		System.out.println("max avg: " + roundToThree(maxAvgJumpLength) + ", player number: " + maxAvgJumpIndex);

	}

	
	static double roundToThree(double num) {
		return (double)((int)(num*1000))/1000;
	}
}
