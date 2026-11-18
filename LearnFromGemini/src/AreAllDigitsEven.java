public class AreAllDigitsEven {
	public static boolean areAllDigitsEven(int num) {
		boolean areAllDigitsEven = true;
		while (num > 0) {
			if ((num %10) % 2 == 1){
				areAllDigitsEven = false;
			}
			num = num/10;
		}
		return areAllDigitsEven;
	}
}
