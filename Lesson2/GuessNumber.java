public class GuessNumber {
        public int calculate(int randomNumber) {
        
            randomNumber = (int) ( Math.random() * 100 + 1 );
            return randomNumber;
        }
        
}