package study;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public Integer i;
    public static void main( String[] args ) throws IOException
    {
        System.out.println("App start");

        System.out.println(new App().i);

        System.out.println("App finish");
    }

}
