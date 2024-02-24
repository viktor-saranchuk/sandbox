
import java.io.IOException;
import javax.swing.*;

import inheritance.Do;
import inheritance.TimePrinter;
import inheritance.Worker;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        playLambda2();
    }

    public static void playLambda2() {
        Worker worker = new Worker();

        worker.work1(() -> System.out.println("Hello"));

        Do job = new Do();
        worker.work1(job);
        worker.work2(job);
    }

    public static void playLambda() {
        new Timer(1000, event -> System.out.println("CTRL+C or CMD+C")).start();
        while (true) {
            
        }
    }

    public static void playEventListener() {
        StringBuilder sb = new StringBuilder("CTRL+C or CMD + C to exit. ");

        new Timer(1000, new TimePrinter(sb)).start();

        int l = sb.length();

        while(l < 30) {
            l = sb.length();
            System.out.println(l);
        }
    }

}
