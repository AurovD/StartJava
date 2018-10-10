import java.util.Scanner; 

public class CalculatorTest {
    
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int number1 = input.nextInt();

        System.out.print("Choose operation (+, -, *, /, ^, %): ");
        char operation = input.next().charAt(0);

        System.out.print("Input number: ");
        int number2 = input.nextInt();

        Calculator testCalc = new Calculator();
        int result = testCalc.getCalculate(number1, number2, operation);
        System.out.println("Result: " + result); 
        
        System.out.println("Do you want to continue?[yes/no]");
        String offer = input.nextLine();
        offer = testCalc.getOffer(offer);
        System.out.println(offer); 
    }
}