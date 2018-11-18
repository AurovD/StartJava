import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
       
        String userNameOne = "";      
        Player playerNameOne = new Player();
        userNameOne = playerNameOne.playerNameOne(userNameOne);
        System.out.println(userNameOne);
        
        String userNameTwo = "";
        Player playerNameTwo = new Player();
        userNameTwo = playerNameTwo.playerNameTwo(userNameTwo);
        System.out.println(userNameTwo);
        
        int randomNumber = 0;
        GuessNumber number = new GuessNumber();
        randomNumber = number.calculateNum(randomNumber);
        System.out.println(randomNumber);
        
        System.out.println("Guess number!!! " + userNameOne + " tries first");
        
        int userNumberOne = 0;
        int userNumberTwo = 0;
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
        
}