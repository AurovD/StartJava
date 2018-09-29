import java.util.Scanner;
public class Random { 

    public static void main(String args[]){
		int randomNumber1 = 67;
		int number = 0;

		System.out.println("Guess number!!!");

			while (randomNumber1 != number) {
        		Scanner input = new Scanner(System.in);
        		System.out.print("Input number: ");
				number = input.nextInt();

			if (number == randomNumber1) {
				System.out.println("Well done!!");
			} else if (number > randomNumber1) {
				System.out.println("The number is smaller.");
			} else {
				System.out.println("The number is larger.");
			}
	}
	System.out.print ("You have guessed.");
   }
}