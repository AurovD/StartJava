import java.util.Scanner;

public class Player  {
    Scanner input = new Scanner(System.in);
    public String playerNameOne(String userNameOne) {
        System.out.println("First player input your name, please.");
        userNameOne = input.nextLine(); 
        return userNameOne;
    }
    public String playerNameTwo(String userNameTwo) {
        System.out.println("Second player input your name, please.");
        userNameTwo = input.nextLine(); 
        return userNameTwo;
    }
    public int userNumberOne(int userNumberOne) {
        userNumberOne = input.nextInt(); 
        return userNumberOne;
    }
    public int userNumberTwo(int userNumberTwo) {
        userNumberTwo= input.nextInt(); 
        return userNumberTwo;
    }
}

