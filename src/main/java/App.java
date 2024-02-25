
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.EventListener;
import java.util.stream.Stream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import inheritance.Do;
import inheritance.InstanceClass;
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
        playMethodReferences2();
    }

    public static void playMethodReferences2() {
        var test = "3".transform(BigInteger::new);
        System.out.println(test.getClass());
    }

    public static void playLambda4() {
        Timer t = null;

        for (var i = 0; i < 10; i++) {

            //illegal. i must be final or effectively final
            //ActionListener listener = event -> System.out.println("CTRL+C or CMD+C. " + i);

            //legal
            var b = i;
            ActionListener listener = event -> System.out.println("CTRL+C or CMD+C. " + b);
            if (t == null) {
                t = new Timer(500, listener);
                continue;
            }

            t.addActionListener(listener);
        }

        t.start();


        while (true) {
            
        }
    }

    public static void playLambda3() {
        var text = "test";

        // text can not be reassigned in the code. So it must be final or effectively final
        ActionListener listener = event -> System.out.println("CTRL+C or CMD+C. " + text);

        new Timer(1000, event -> System.out.println("CTRL+C or CMD+C. %s")).start();
        //text = "stop";
        while (true) {
            
        }
    }

    public static void playMethodReferences() {
        String[] arr = new String[]{"1", "3", "2"};

        Arrays.sort(arr, InstanceClass::compareTo);

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
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
