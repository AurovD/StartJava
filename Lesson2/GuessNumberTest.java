import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        
        Player playerOne = new Player( "First player" );
        Player playerTwo = new Player( "Second player" );
       
        System.out.println(playerOne.playerName);
    }
}