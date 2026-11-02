import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rndNumGen = new Random();

		String userName = "George Washington";
		int userMoneyBank = 100;
		int startingMoney = 100;
		int userMoneyBet = 0;
		int gambles = 0;
		int correctGambles = 0;
		int partialGambles = 0;
		int wrongGambles = 0;
		int userGuess = 0;//it will anyways be overridden when the user will make a guess.

		//Money that is bet isn't anymore part of his bank. 

		System.out.println("Howdey there! Welcom to \"Pasul Le'dut!\" Casino!");
		System.out.println("***WARNING: You will be taking a risk at being disqualified for testimony at jewish court. ");
		System.out.println("Playing in the casino is exclusively at the user's personal risk.");

		System.out.println("On a nicer tone, what is you name?");
		System.out.print("Enter your name here: ");
		userName = scn.nextLine();

		System.out.println("Hello " + userName + "! It's just perfectly stupendous to meet you!");
		System.out.println("You have " + userMoneyBank +"$ to use in this Casino.");
		System.out.println("The gameplan goes as follows: ");
		System.out.println("1. You - " + userName + " bet a sum of dough from your money bank");
		System.out.println("2. You guess a random number between 1 and your Bar Mitsva age.");
		System.out.println("Now this splits up: \n Correct? The cash you bet quadruples! \n Off by one? Your bet doubles! \n Completely gone bonkers? Lost your betting money, there's a reason that you shouldn't gamble. \n 3. You can play again if you have something left.");
		System.out.println("----------------------------------Let the Game Begin!------------------------------------------");

		while (true) {
			System.out.println("You have " + userMoneyBank + "$ in your bank.");

			System.out.println("Do you want to play a round? If so type \"yes\", otherwise type \"no\". \n(this is letter sensitive so if you don't type the letters \"n\" and \"o\" then the program will take it granted that you want to continue.) .");
			System.out.print("Type your answer here: ");
			if (scn.nextLine().toLowerCase().equals("no")) {
				break;
			}


			//needs to get out of the loop with a perfect bet, a valid N and the user can afford this.
			while (true) {
				System.out.print("Bet an amount: ");

				if (scn.hasNextInt()) {
					userMoneyBet = scn.nextInt();
					if (userMoneyBet < 0) {
						System.out.println("Invalid input! Please type a WHOLE POSITIVE NUMBER, without any decimal or negitive.");
						/*Over here and in the next else if (the one that checks if you have enough dough for the bet) you DO NOT PUT A SCN.NEXT - 
						because we read AND emptied the buffer already.*/
					} else if (userMoneyBet > userMoneyBank) {
						System.out.println("Sorry " + userName + ", you don't have enough money to bet so much.");

					} else {
						System.out.println("Bet has been accepted.");
						userMoneyBank = userMoneyBank - userMoneyBet;
						break;
					}
				} else {
					System.out.println("Invalid input! Please type a WHOLE POSITIVE NUMBER, without any decimal or negitive.");
					scn.next();
					/*clears scanner's buffer as so to not cause an infinite loop. The buffer is full in the first place because we didn't
					read anything from the user - it wasn't an integer.*/
				}

			}

			//we have the bank updated, and we have a perfectly valid bet:
			System.out.println("Ok, Mr. " + userName + ", you shall now guess a random number in the range of 1-13! Let the guessing begin!");
			//need to get a valid guess when out of the loop
			while (true) {
				System.out.print("Type your guess here: ");
				if (scn.hasNextInt()) {
					userGuess = scn.nextInt();

					if (1 <= userGuess && userGuess <= 13) {
						System.out.println("System: guess of number " + userGuess + " was recieved.");
						break;
					} else {
						System.out.println("This message is hereby addressed to his Highness Sir " + userName  + ". \nThe sender is rather dissapointed of his Highness not being able to comprehend what a number between 1 and 13 is.\nSending you our best wishes, the \"Pasul Le'dut!\" Casino!");
					}
				} else {
					System.out.println("That, my dear friend isn't a number I was looking for. Try something else! Maybe A NUMBER...");
					scn.next(); //lots of comments about this line in the first (nested) while loop - Ayyen Sham.
				}

			}

			int randomNumber = rndNumGen.nextInt(13)+1;

			int guessAccuracy = Math.abs(userGuess-randomNumber);
			int moneyGrowthRate;
			if (guessAccuracy == 0) {
				moneyGrowthRate = 4;
				correctGambles++;
				System.out.println("Congradulations! Spot on! You win " + userMoneyBet*moneyGrowthRate + "$");
			} else if (guessAccuracy == 1) {
				moneyGrowthRate = 2;
				partialGambles++;
				System.out.println("Congradulations! Off by one! You win " + userMoneyBet*moneyGrowthRate + "$");
			} else {
				moneyGrowthRate = 0;
				wrongGambles++;
				System.out.println("You were wrong. You lost all your bet, aka " + userMoneyBet + "$");
			}

			gambles ++;
			userMoneyBank += userMoneyBet*moneyGrowthRate;
			userMoneyBet = 0;

			if (userMoneyBank == 0) {
				System.out.println("\nSorry " + userName + "You have lost all your money.\nThere's a reason they say you shouldn't gamble.");
				break;
			}



		}
		System.out.println("\nHereby we shall give you the game summary.");
		System.out.println("Out of " + gambles + "Gambels: ");
		System.out.println("Perfect guesses: " + correctGambles);
		System.out.println("Almost perfect guesses: " + partialGambles);
		System.out.println("Wrong guesses: " + wrongGambles);
		if (userMoneyBank >= startingMoney) {
			System.out.println("In total you won: " + (userMoneyBank-startingMoney) + "$");
		} else {
			System.out.println("You lost " + (startingMoney - userMoneyBank) + "$. You are a complete failure.");
		}


	}


}
