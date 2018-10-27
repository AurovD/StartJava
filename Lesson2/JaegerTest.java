
import java.util.Scanner;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Tacit Ronin");
        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Crimson Typhoon");

        Scanner input = new Scanner(System.in);
        System.out.print("Write name of Jaeger: ");
        String modelName = input.nextLine();

        switch (modelName) {
            case "Tacit Ronin":
                System.out.println(jaegerOne.getModelName());

                Jaeger markOne = new Jaeger();
                markOne.setMark("Mark-1");
                System.out.println("Mark:" + markOne.getMark());

                Jaeger statusOne = new Jaeger();
                statusOne.setStatus("Destroyed");
                System.out.println("Status:" + statusOne.getStatus());
                break;
            case "Crimson Typhoon":                
                System.out.println(jaegerTwo.getModelName());

                Jaeger markTwo = new Jaeger();
                markTwo.setMark("Mark-1");
                System.out.println("Mark: " + markTwo.getMark());

                Jaeger statusTwo = new Jaeger();
                statusTwo.setStatus("Destroyed");
                System.out.println("Status: " + statusTwo.getStatus());
                break;
            default:
                System.out.println("Error!!");
        }
    }

}
