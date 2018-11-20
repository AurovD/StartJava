
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First player input your name, please.");
        String userNameOne = input.nextLine();
        Player playerOne = new Player();
        playerOne.setUserName(userNameOne);

        System.out.println("Second player input your name, please.");
        String userNameTwo = input.nextLine();
        Player playerTwo = new Player();
        playerTwo.setUserName(userNameTwo);

        int randomNumber;
        GuessNumber guessNumber = new GuessNumber();
        randomNumber = guessNumber.getRandomNumber();

        System.out.println("Guess number!!! " + userNameOne + " tries first");

        boolean answer = false;
        int turn = 1;

        while (answer == false) {
            if (turn % 2 == 1) {
                System.out.print(userNameOne + " inputs number: ");
            } else {
                System.out.print(userNameTwo + " inputs number: ");
            }

            int userNumber = guessNumber.getUserNumber();
            System.out.println(userNumber);

            answer = guessNumber.getAnswer();
            
            if (answer == true) {
                if (turn % 2 == 1) {
                    System.out.print(userNameOne + " is winner. Number was " + randomNumber);
                } else {
                    System.out.print(userNameTwo + " is winner. Number was " + randomNumber);
                }
                break;
            }
            turn += 1;
        }

    }
}
