import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("I have nunber from 1 to 100");
        System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i >= 0; i--) {
            int guess = scanner.nextInt();
            if (i==0) {
                System.out.println("You lose, number was " + randomNumber);
                break;
            }
            System.out.println("You have " + (i) + " guesses");
            if (randomNumber < guess) {
                System.out.println("less");
            }
            else if (randomNumber > guess) {
                System.out.println("more");
            }
            else if (randomNumber == guess) {
                System.out.println("You win");
                break;
            }
        }
    }


}
