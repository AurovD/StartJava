
import java.util.Scanner;

public class GuessNumber {

    private int randomNumber;
    private int userNumber;

    public GuessNumber(String userNameTwo, String userNameOne) {
        randomNumber = (int) (Math.random() * 100 + 1);
        System.out.println(randomNumber);

        boolean answer = false;
        int turn = 1;

        while (answer == false) {
            if (turn % 2 == 1) {
                System.out.println(userNameOne + " tries to guess the number: ");
                Scanner input = new Scanner(System.in);
                userNumber = input.nextInt();
            } else {
                System.out.println(userNameTwo + " tries to guess the number: ");
                Scanner input = new Scanner(System.in);
                userNumber = input.nextInt();
            }

            if (userNumber == randomNumber) {
                answer = true;
                System.out.println("Well done!!");
                if (turn % 2 == 1) {
                    System.out.println(userNameOne + " is a winner!!");
                } else {
                    System.out.println(userNameTwo + " is a winner");
                }
                break;
            } else if (userNumber > randomNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("The number is larger.");
            }
            turn += 1;
        }
    }
}
