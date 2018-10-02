import java.util.Scanner; 

public class Calculator {
    public static void main (String [] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int number1 = input.nextInt();

        System.out.print("Choose operation (+, -, *, /, ^, %): ");
        char operation = input.next().charAt(0);
        int result;

        System.out.print("Input second number: ");
        int number2 = input.nextInt();
            			
            if (operation == '+') {
                result = number1 + number2; 
                    System.out.println(result);
            } else if (operation == '-') {
                result = number1 - number2; 
                    System.out.println(result);
            } else if (operation == '*') {
                result = number1 * number2; 
                    System.out.println(result);
            } else if (operation == '/') {
                result = number1 / number2;
                    System.out.println(result); 
            } else if (operation == '%') {
                result = number1 % number2; 
                    System.out.println(result);
            } else if (operation == '^') {
                result = number1 * number1; 
                    System.out.println(result);
                result = number2 * number2; 
                    System.out.println(result);
            } else {
            System.out.println("Error!!");
            }
        		
}

}
