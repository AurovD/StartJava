
import java.util.Scanner;

public class GuessNumber {

    private int randomNumber;
    private int userNumber;
    private boolean answer;
    
    public int getRandomNumber() {  

        randomNumber = (int) (Math.random() * 100 + 1);
        return randomNumber;
    }
    
        void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
        
    public int getUserNumber() {  
        Scanner input = new Scanner(System.in);
        userNumber = input.nextInt(); 
        return userNumber;
    }
    
        void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }
        
    public boolean getAnswer() {  
        if (userNumber == randomNumber) {
                answer = true;
                System.out.println("Well done!!");
        } else {
            answer = false;
            
            if (userNumber > randomNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("The number is larger.");
            }
}
        return answer;
    }
    
        void setAnswer(boolean answer) {
        this.answer = answer;
    }



}
