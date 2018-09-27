import java.util.Scanner; 

class Calculator {
    public static void main (String [] args) { 
        Scanner input = new Scanner(System.in);

        System.out.print("Input 2 numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

        System.out.print("Choose operation (+, -, *, /, ^, %): ");
        char operation = input.next().charAt(0);
        int result;

        if (operation == '+') {
        	  result = number1 + number2; 
              System.out.println(result);
        } else if (operation == '-') {
        	   result = number1 - number2; 
               System.out.println(result);
        } else if (operation == '*') {
        	   result = number1 * number2; 
               System.out.println(result);
        } else if(operation == '/') {
        	   result = number1 / number2;
               System.out.println(result); 
        } else if(operation == '^') {
        	   result = number1 ^ number2; 
               System.out.println(result);
        } else if (operation == '%') {
        	   result = number1 % number2; 
               System.out.println(result);
        } else {
            System.out.println("Error!!!");
        }
    }

}
