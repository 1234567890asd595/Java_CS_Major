import java.util.Scanner;
public class charOfDigitToInt {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a digit: ");
		char digitCharachter = scn.next().charAt(0);
		int digitAsInteger = digitCharachter - '0';
		System.out.println("Hi! i'm " + digitAsInteger + " remember me? Can I take a ride on the bus (Don't let the Pigeon ride the bus ע\"ש)");
	}
}
