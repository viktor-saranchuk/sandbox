package study;
import java.io.IOException;

import encaapsulation.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Employee emp = new Employee("Ordinar Guy");
        Employee boss = new Employee("Boss");

        System.out.println(boss.isEquals(emp));
    }
}
