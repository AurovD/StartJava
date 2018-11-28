
import java.util.Scanner;

public class GuessNumber {

    private int userNumber;
    private int randomNumber;
    
    public GuessNumber(int randomNumber) {
        randomNumber = (int) (Math.random() * 100 + 1);
    }
    
    

    public boolean guessNumber(boolean answer, int randomNumber, int userNumber) {

        
            if (userNumber == randomNumber) {
                answer = true;
                System.out.println("Well done!!");
                
            } else if (userNumber > randomNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("The number is larger.");
            }
        return answer;
    }
}
