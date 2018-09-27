import java.util.Scanner;
public class Random { 

    public static void main(String args[]){
		int random_number1 = 67;
		int number = 0;

		System.out.println("Guess number!!!");

		while (random_number1 != number) {
        Scanner k = new Scanner(System.in);
        System.out.print ("Input number: ");
		number = k.nextInt();

		if (number == random_number1) {
			System.out.println ("Well done!!");
		}
		else if (number > random_number1) {
			System.out.println ("The number is smaller.");
		} 
		else {
			System.out.println ("The number is larger.");
		}
	}
	System.out.print ("You have guessed.");
   }
}