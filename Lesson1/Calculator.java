import java.util.Scanner; 

public class Calculator {
    public static void main (String [] args) { 
        Scanner input = new Scanner(System.in);
            System.out.print("Input first numbers: ");
            int number1 = input.nextInt();

            System.out.print("Choose operation (+, -, *, /, ^, %): ");
            char operation = input.next().charAt(0);
            int result;

<<<<<<< HEAD
        	System.out.print("Input second numbers: ");
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
        		if (operation == '^') {
        	    	    System.out.print("Input number: ");
		            int number1 = input.nextInt();

	        	    result = number1 * number1; 
    	                    System.out.println(result);
           		} else {
			    System.out.print("Input 2 numbers: ");
			    int number1 = input.nextInt();
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
			    } else {
		                 System.out.println("Error!!");
			    }
        	}
>>>>>>> 01a28f50482f98694771a8ad8286c4395d99da3c
    }

}
