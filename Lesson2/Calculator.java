import java.util.Scanner; 

class Calculator {
    Scanner input = new Scanner(System.in);
        
    public int getInputNum(){    
        System.out.print("Input number: ");
        int number = input.nextInt();
        return number;
        }
    public char getOperation() {
        System.out.print("Choose operation (+, -, *, /, ^, %): ");
        char operation = input.next().charAt(0);
        return operation;
    }
    public int getCalc(int num1, int num2, char operation){
        int result=0; 
        int number1=0;
        int number2=0;
        switch (operation){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '%':
                result = number1 % number2;
                break;
            case '^':
                int count = 1;
                int degree = number1;
                while (count != number2) {
                degree = degree * number1;
                count++;
            }
                result = degree;
                break;
            default:
                System.out.println("Error!!");
        }
        return result;                
    }
}
        