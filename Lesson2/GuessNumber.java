public class GuessNumber {
    double a = Math.random();
        while (randomNumber != userNumber) {
            int userNumber = (int) (Math.random() * 100 + 1);
            
            userNumber = input.nextInt();

            if (userNumber == randomNumber) {
                System.out.println("Well done!!");
            } else if (userNumber > randomNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("The number is larger.");
            }
        }
}