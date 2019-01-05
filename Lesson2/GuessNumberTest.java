
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First player input your name, please.");
        Player userPlayerOne = new Player(input.next());

        System.out.println("Second player input your name, please.");
        Player userPlayerTwo = new Player(input.next());

        System.out.println("Guess number!!!");
        
        GuessNumber guessNumberGame = new GuessNumber(userPlayerOne, userPlayerTwo);
        System.out.println("First player inputs number first");
        
        String userAnswer;
        
        do {
            guessNumberGame.startGame();
            
            do {    
                System.out.println("Do you want to continue?[yes/no]");
                userAnswer = input.next();
                if (userAnswer.equals("yes")) {
                    System.out.println("Let's play again!!!");
                } else if (userAnswer.equals("no")) {
                    System.out.println("Bye");
                    break;
                } else {
                    System.out.println("Error!!");
                }
            } while (!userAnswer.equals("yes"));
        } while (!userAnswer.equals("no"));   
    }
}
