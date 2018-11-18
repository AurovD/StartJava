import java.util.Scanner;

public class GuessNumber {
        public int calculateNum(int randomNumber) {
        
            randomNumber = (int) ( Math.random() * 100 + 1 );
            return randomNumber;
        }
        public int guessNumber(int randomNumber, String userNameOne, String userNameTwo) { 
            Scanner input = new Scanner(System.in);
            while (randomNumber != userNumber) {
                System.out.print(userNameOne + " inputs number: ");
                userNumber = input.nextInt();
                if (randomNumber == userNumber) {
                    System.out.print (userNameOne + " is a winner!! Number is " + randomNumber);
                    break;
                }

                if (userNumber > randomNumber) {
                    System.out.println("The number is smaller.");
                } else {
                    System.out.println("The number is larger.");
                }

                System.out.print(userNameTwo + " inputs number: ");
                userNumber = input.nextInt(); 
                if (randomNumber == userNumber) {
                    System.out.print (userNameTwo + " is a winner!! Number is " + randomNumber);
                    break;
                }    
        }
            return
        }
        
}