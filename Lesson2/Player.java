import java.util.Scanner;

public class Player  {
    Scanner input = new Scanner(System.in);
    public String playerName(String userName) {
        userName = input.nextLine(); 
        return userName;
    }
    
    
    public int userNumber(int userNumber) {
        userNumber= input.nextInt(); 
        return userNumber;
    }
}

