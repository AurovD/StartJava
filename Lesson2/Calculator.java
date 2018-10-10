
import java.util.Scanner;

public class Calculator {
    public int getCalculate(int number1, int number2, char operation){
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
                while (count != number2){
                    result = result * number1;
                    count++;
                }
                break;
            default:
                System.out.println("Error!!");
        } 
    return result;
    }
    public void getOffer(String offer) {
        return offer;
    }    
        public void setOffer(String offer){
            this.offer = offer;
            while((offer != "yes") & (offer != "no")) {
                System.out.println("Error");
            }
        
        }
}
        