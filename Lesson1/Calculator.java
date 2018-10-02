import java.util.Scanner; 

public class Calculator {
    public static void main (String [] args) { 
        Scanner input = new Scanner(System.in);
<<<<<<< HEAD
        System.out.print("Input first number: ");
        int number1 = input.nextInt();
=======
            System.out.print("Input first number: ");
            int number1 = input.nextInt();
>>>>>>> d6e219f62e972e1f710867a1ce6b15e1120d42bf

        System.out.print("Choose operation (+, -, *, /, ^, %): ");
        char operation = input.next().charAt(0);
        int result;

<<<<<<< HEAD
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
=======
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
>>>>>>> d6e219f62e972e1f710867a1ce6b15e1120d42bf
        		
}

}
