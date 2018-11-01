import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("First player input your name, please.");
        String userNameOne = input.nextLine();        
        Player playerOne = new Player( userNameOne );
        
        System.out.println("Second player input your name, please.");
        String userNameTwo = input.nextLine();    
        Player playerTwo = new Player( userNameTwo );
        
        int randomNumber = 0;
        GuessNumber number = new GuessNumber();
        randomNumber = number.calculate(randomNumber);     
                
        System.out.println("Guess number!!! " + playerOne.playerName + " tries first");
        int userNumber = 0; 
        int attempt = 0;
        while (randomNumber != userNumber) {
                System.out.print(playerOne.playerName + " input number: ");
                userNumber = input.nextInt();
                if (randomNumber == userNumber) {
                    System.out.print (playerOne.playerName + " is a winner!!");
                    break;
                }

                if (userNumber > randomNumber) {
                    System.out.println("The number is smaller.");
                } else {
                    System.out.println("The number is larger.");
                }
            
            System.out.print(playerTwo.playerName + " input number: ");
            userNumber = input.nextInt(); 
            if (randomNumber == userNumber) {
                System.out.print (playerTwo.playerName + " is a winner!!");
                break;
            }    
            if (userNumber > randomNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("The number is larger.");
            }
        }
    }
}