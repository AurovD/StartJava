
import java.util.Scanner;

public class Player {

    private String userName;
    private int userNumber;

    public String getUserName() {
        return userName;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }
    
    public int getUserNumber() {
        GuessNumber guessNumber = new GuessNumber();
        userNumber = guessNumber.getUserInputNumber();
        return userNumber;
    }

    void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }
}

