import java.util.Scanner;

public class Guess { 
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
            int randomNumber = 67;
            int userNumber = 0;

            System.out.println("Guess number!!!");
            while (randomNumber != userNumber) {
            System.out.print("Input number: ");
		userNumber = input.nextInt();

		if (userNumber == randomNumber) {
                    System.out.println("Well done!!");
		} else if (userNumber > randomNumber) {
                    System.out.println("The number is smaller.");
		} else {
                    System.out.println("The number is larger.");
		}
            }
            System.out.print ("You have guessed.");
   }
}
