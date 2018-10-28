
public class Calculator {

    public int calculate(int number1, int number2, char operation) {
        int result = 1; 
        switch (operation) {
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
                int degree = number1;
                for (int count = 1; count <= number2 - 1; count++) {
                    degree *= number1;
                }
                result = degree;
                break;
            default:
                System.out.println("Error!!");
        }
        return result;
    }
}
