
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException{
        Employee employee1 = new Employee("Alice");
        Employee employee2 = new Employee("Bob");

        System.out.println(employee1.compareTo(employee2));
        System.out.println("Access static variable: " + Employee.defaultName);
        System.out.println("Access staic via instance: " + employee1.defaultName);
        System.out.println(new Employee("Bobby").defaultName);

        try {
            Employee employee3 = new Employee(null);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        
    }
}
