public class Calculator {
    public int getCalc(int number1, int number2, char operation){
        int result = 0;
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
                while (count != number2){
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
        