package study;
import java.io.IOException;
import java.time.LocalDate;

import calendar.Calendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        LocalDate ld = LocalDate.now();
        
        System.out.println(Calendar.createCalendar(ld));
    }
}
