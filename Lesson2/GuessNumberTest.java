import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        
        Player playerOne = new Player( "First player" );
        Player playerTwo = new Player( "Second player" );
        
        int randomNumber = 0;
        GuessNumber number = new GuessNumber();
        randomNumber = number.calculate(randomNumber);     
                
        System.out.println("Guess number!!!");
        int userNumber = 0; 
        while (randomNumber != userNumber) {
            System.out.print(playerOne.playerName + " input number: ");
            userNumber = input.nextInt();
            if (randomNumber == userNumber) {
                System.out.print ("First player is a winner!!");
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
                System.out.print ("Second player is a winner!!");
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