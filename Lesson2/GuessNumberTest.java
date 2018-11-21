
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

        System.out.println("Guess number!!! ");

        boolean answer = false;

        while (answer == false) {
            System.out.print(userNameOne + " inputs number: ");
            int userNumberOne = playerOne.getUserNumber();

            System.out.print(userNameTwo + " inputs number: ");
            int userNumberTwo = playerTwo.getUserNumber();

            answer = guessNumber.getAnswer(userNumberOne, userNumberTwo, userNameOne, userNameTwo);

            if (answer == true) {
                break;
            }

            if ((userNumberOne > randomNumber) && (userNumberTwo > randomNumber)) {
                System.out.println("The number is smaller than both.");
            } else if ((userNumberOne < randomNumber) && (userNumberTwo < randomNumber)) {
                System.out.println("The number is larger than both.");
            } else {
                System.out.println("The number is somewhere between " + userNumberOne + " and " + userNumberTwo);
            }
        }

    }
}
