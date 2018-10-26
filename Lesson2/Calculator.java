
public class Calculator {

    public int calculate(int number1, int number2, char operation) {
        int result = 0;
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
                count
                while (count != number2) {
                    result *= number1;
                    count++;
                }
                break;
            default:
                System.out.println("Error!!");
        }
        return result;
    }
}
