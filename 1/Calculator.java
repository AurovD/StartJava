import java.util.Scanner; // подключаем сканер
class Calculator {
    public static void main (String [] args) {
 
        Scanner k = new Scanner(System.in);
        System.out.print ("Input 2 numbers: ");
		int number1 = k.nextInt();
		int number2 = k.nextInt();
        System.out.print ("Choose operation (+, -, *, /, ^, %): ");
        char Operation = k.next().charAt(0);
        if (Operation == '+') {
        	  int result = number1 + number2; 
             System.out.println (result);
        }
        else if (Operation == '-') {
        	  int result = number1 - number2; 
             System.out.println (result);
        }
        else if (Operation == '*') {
        	  int result = number1 * number2; 
             System.out.println (result);
        }
        else if(Operation == '/') {
        	  int result = number1 / number2; 
             System.out.println (result);
        }
        else if(Operation == '^') {
        	  int result = number1 ^ number2; 
             System.out.println (result);
        }
        else if (Operation == '%') {
        	  int result = number1 % number2; 
             System.out.println (result);
        }
        else {
            System.out.println ("Error!!!");
        }
    }
}
