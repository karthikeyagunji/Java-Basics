import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;
        boolean hasGuessed = false;
        
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        
        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
                hasGuessed = true;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        sc.close();
    }
}