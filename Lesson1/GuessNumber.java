
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNumber = 0;
        String userAnswer;
        System.out.println("First player input your name, please.");

        String userNameFirst = scan.next();

        System.out.println("Second player, please, input your number");

        String userNameSecond = scan.next();

        int randomNumber = (int) (Math.random() * 100 + 1);

        System.out.println("Try guess number!!!");
        do {

            do {
                System.out.println(userNameFirst + " inputs his number first");

                userNumber = scan.nextInt();

                if (userNumber == randomNumber) {
                    System.out.println("Well done!!");
                    System.out.println(userNameFirst + " wins!!");
                } else if (userNumber > randomNumber) {
                    System.out.println("The number is smaller.");
                } else {
                    System.out.println("The number is larger.");
                }

                System.out.println(userNameSecond + " tries to guess the number: ");
                userNumber = scan.nextInt();

                if (userNumber == randomNumber) {
                    System.out.println("Well done!!");
                    System.out.println(userNameSecond + " wins!!");
                } else if (userNumber > randomNumber) {
                    System.out.println("The number is smaller.");
                } else {
                    System.out.println("The number is larger.");
                }

            } while (userNumber != randomNumber);



            System.out.println("Do you want to continue?[yes/no]");
            userAnswer = scan.next();
            if (userAnswer.equals("yes")) {
                System.out.println("Let's play again!!!");
            } else if (userAnswer.equals("no")) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Error!!");
            }
        } while (userAnswer.equals("yes"));
    }
}