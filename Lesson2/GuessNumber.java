
import java.util.Scanner;

public class GuessNumber {

    private int randomNumber;
    private int userInputNumber;
    private boolean answer;

    public int getRandomNumber() {

        randomNumber = (int) (Math.random() * 100 + 1);
        return randomNumber;
    }

    void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getUserInputNumber() {
        Scanner input = new Scanner(System.in);
        userInputNumber = input.nextInt();
        return userInputNumber;
    }

    void setUserInputNumber(int userInputNumber) {
        this.userInputNumber = userInputNumber;
    }

    public boolean getAnswer(int userNumberOne, int userNumberTwo, String userNameOne, String userNameTwo) {
        if (userNumberOne == randomNumber) {
            answer = true;
            System.out.println("Well done!!");
            System.out.print(userNameOne + " is winner. Number was " + randomNumber);
        } else if (userNumberTwo == randomNumber) {
            answer = true;
            System.out.println("Well done!!");
            System.out.print(userNameTwo + " is winner. Number was " + randomNumber);
        }

        return answer;
    }

    void setAnswer(boolean answer) {
        this.answer = answer;
    }

}
