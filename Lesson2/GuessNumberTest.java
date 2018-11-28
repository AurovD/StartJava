
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First player input your name, please.");
        String userNameOne = input.nextLine();
        Player playerOne = new Player(userNameOne);

        System.out.println("Second player input your name, please.");
        String userNameTwo = input.nextLine();
        Player playerTwo = new Player(userNameTwo);

        System.out.println("Guess number!!! ");
            
        GuessNumber game = new GuessNumber();
        int randomNumber = game.GuessNumber(randomNumber);
        
            boolean answer = false;
        int turn = 1;
        int userNumber = 0;

        while (answer) {
            
            if (turn % 2 == 1) {
                System.out.println(userNameOne + " tries to guess the number: ");
                userNumber = input.nextInt();
            } else {
                System.out.println(userNameTwo + " tries to guess the number: ");
                userNumber = input.nextInt();
            }
            answer = game.guessNumber(answer, randomNumber, userNumber);
            if (turn % 2 == 1) {
                    System.out.println(userNameOne + " is a winner!!");
                } else {
                    System.out.println(userNameTwo + " is a winner");
                }

            turn += 1;
        }
    }
}
