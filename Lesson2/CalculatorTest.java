public class CalculatorTest {
    
    public static void main (String [] args) { 
        Calculator test = new Calculator();
        int number1 = test.getInputNum();
        char operation = test.getOperation();
        int number2 = test.getInputNum();
        int result = test.getCalc(number1,number2,operation);
        System.out.println("Result: "+result);  
    }
}