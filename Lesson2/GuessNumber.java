public class GuessNumber {
        public int calculateNum(int randomNumber) {
        
            randomNumber = (int) ( Math.random() * 100 + 1 );
            return randomNumber;
        }
        
}