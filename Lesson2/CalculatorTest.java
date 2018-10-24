
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userAnswer;

        System.out.print("Input number: ");

        do {

            int number1 = input.nextInt();

            System.out.print("Choose operation (+, -, *, /, ^, %): ");
            char operation = input.next().charAt(0);

            System.out.print("Input number: ");
            int number2 = input.nextInt();

            Calculator calculator = new Calculator();
            int result = calculator.Calculate(number1, number2, operation);
            System.out.println("Result: " + result);

            System.out.println("Do you want to continue?[yes/no]");
            userAnswer = input.next();
            if (userAnswer.equals("yes")) {
                System.out.println("Input number again: ");
            } else if (userAnswer.equals("no")) {
                System.out.println("Bye");
            } else {
                System.out.println("Error!!");
            }
        } while (!userAnswer.equals("no"));
    }
}
