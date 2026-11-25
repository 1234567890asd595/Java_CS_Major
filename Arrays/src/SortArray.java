import java.util.Random;
public class SortArray {
	public static void main(String[] args) {
		Random rndGen = new Random();
		
		int[] unorderedArr = new int[20];
		for (int i = 0; i < unorderedArr.length; i++) {
			unorderedArr[i] = rndGen.nextInt(100) + 1;
			System.out.print(unorderedArr[i] + " ");
		}
		
		
		
		sort(unorderedArr);
		System.out.println();
		for (int i = 0; i < unorderedArr.length; i++) {
			System.out.print(unorderedArr[i] + " ");
		}
	}
	
	
	static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int bucket = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = bucket;
				}
			}	
		}
	}
}
