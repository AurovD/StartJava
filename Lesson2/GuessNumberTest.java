
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

        boolean answer = false;
        int turn = 1;
        GuessNumber guessNumber = new GuessNumber();
        int randomNumber = guessNumber.randomNumber;
        
            
    }
}
