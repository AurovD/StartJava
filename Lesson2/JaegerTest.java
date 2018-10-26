
import java.util.Scanner;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jeagerOne = new Jaeger();
        jeagerOne.setModelName("Tacit Ronin");
        Jaeger jeagerTwo = new Jaeger();
        jeagerTwo.setModelName("Crimson Typhoon");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Write name of Jaeger: ");
        String modelName = input.next();

        if (modelName == jeagerOne.getModelName()) {
            Jaeger markOne = new Jaeger();
            markOne.setMark("Mark-1");
            System.out.println(markOne.getMark());
        } else {
            Jaeger markTwo = new Jaeger();
            markTwo.setMark("Mark-1");
            System.out.println(markTwo.getMark());
        }
    }

}
