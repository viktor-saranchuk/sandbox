package study;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        int i = calc();
        System.out.println("Result: " + i);
    }

    public static int calc() {
        int i = 0;

        return switch (i) {
            case 0 -> {
                System.out.println(i);
                yield 0;
            }
            default -> 1;
        };
    }
}
