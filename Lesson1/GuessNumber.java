
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int userNumber;
        
        System.out.println("First player input your name, please.");
        String namePlayerOne = scan.next();
        
        System.out.println("First player input your name, please.");
        String namePlayerTwo = scan.next();

        int randomNumber = (int) (Math.random() * 100 + 1);
        
        do {  
            System.out.println("Try guess number!!!");
     
            do {
                System.out.println(namePlayerOne + ", please, try to guess the number: ");
                userPlayerOne.setUserNumber(input.nextInt());

                if (userPlayerOne.getUserNumber() == randomNumber) {
                    System.out.println("Well done!!");
                    System.out.println(userPlayerOne.getUserName() + " wins!!");
                } else if (userPlayerOne.getUserNumber() > randomNumber) {
                    System.out.println("The number is smaller.");
                } else {
                    System.out.println("The number is larger.");
                }

                System.out.println(userPlayerTwo.getUserName() + " tries to guess the number: ");
                userPlayerTwo.setUserNumber(input.nextInt());

                if (userPlayerTwo.getUserNumber() == randomNumber) {
                    System.out.println("Well done!!");
                    System.out.println(userPlayerTwo.getUserName() + " wins!!");
                } else if (userPlayerTwo.getUserNumber() > randomNumber) {
                    System.out.println("The number is smaller.");
                } else {
                    System.out.println("The number is larger.");
                }
            } while (userPlayerOne.getUserNumber() != randomNumber && userPlayerTwo.getUserNumber() != randomNumber);   
    }
}
