import java.util.Scanner;

public class GuessingGame {

    int random;
    GuessingGame(){
        random = (int) Math.ceil(Math.random()*100);
    }

    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();

        int guessNumber;
        int guessResult;
        System.out.println("Welcome to the guessing game. Guess a number between 1 and 100");

        do {
            System.out.println("Guess the number: ");
            guessNumber = input.nextInt();
            guessResult = game.guess(guessNumber);

            if(guessResult == 0) {
                System.out.println("Congratulations! You guessed the number" );
                break;
            } else if(guessResult > 0) {
                System.out.println("Your guess is higher than the number");
            } else {
                System.out.println("Your guess is lower than the number");
            }
        } while(true);
            
    }
}
