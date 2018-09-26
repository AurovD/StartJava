import java.util.Scanner;
public class Random{ 

   public static void main(String args[]){
    System.setOut(new PrintStream(System.out, true, "Cp866"));
    System.setErr(new PrintStream(System.err, true, "Cp866"));

      int a = 0; // Начальное значение диапазона - "от"
      int b = 100; // Конечное значение диапазона - "до"
      
      int random_number1 = a + (int) (Math.random() * b); // Генерация случ-го числа
      System.out.println("Угадай число!!!");
      
      int number = 0;

      while (random_number1 != number) {
        Scanner k = new Scanner(System.in);
        System.out.print ("Input number: ");
		number = k.nextInt();

		if (number == random_number1) {
			System.out.println ("Well done!!");
		}
		else if (number > random_number1) {
			System.out.println ("The number is smaller.");
		} 
		else {
			System.out.println ("The number is larger.");
		}

	}
	System.out.print ("You have guessed.");
   }
}