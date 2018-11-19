
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("First player input your name, please.");
        String userName = "";
        Player playerNameOne = new Player();
        String userNameOne = playerNameOne.playerName(userName);

        System.out.println("Second player input your name, please.");
        Player playerNameTwo = new Player();
        String userNameTwo = playerNameTwo.playerName(userName);

        int randomNumber = 0;
        GuessNumber number = new GuessNumber();
        randomNumber = number.calculateNum(randomNumber);

        System.out.println("Guess number!!! " + userNameOne + " tries first");

        boolean answer = false;
        int turn = 1;

        while (answer == false) {
            if (turn % 2 == 1) {
                System.out.print(userNameOne + " inputs number: ");
            } else {
                System.out.print(userNameTwo + " inputs number: ");
            }

            int userNumber = 0;
            Player playerNumber = new Player();
            userNumber = playerNumber.userNumber(userNumber);
            System.out.println(userNumber);

            GuessNumber playerResult = new GuessNumber();
            answer = playerResult.guessNumber(answer, randomNumber, userNumber);

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
