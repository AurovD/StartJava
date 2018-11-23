
import java.util.Scanner;

public class GuessNumber {

    int randomNumber;
    int userNumber;
    boolean answer;

    public GuessNumber() {

        randomNumber = (int) (Math.random() * 100 + 1);
        System.out.println(randomNumber);

        answer = false;

        while (answer == false) {

            System.out.print(" Please, input number: ");
            Scanner input = new Scanner(System.in);
            userNumber = input.nextInt();

            if (userNumber == randomNumber) {
                answer = true;
                System.out.println("Well done!!");
                break;
            } else if (userNumber > randomNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("The number is larger.");
            }
        }
    }
}
