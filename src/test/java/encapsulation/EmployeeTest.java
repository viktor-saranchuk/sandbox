package encapsulation;

import org.junit.Test;
import org.junit.Assert;

public class EmployeeTest {

    @Test
    public void testClass() {
        Employee boss = new Employee("BOSS", 30);
        Employee steve = new Employee("Steve", 20);

       // steve replaces boss' name.
        steve.replaceName(boss);

        Assert.assertEquals("Names must be equal.", steve.getName(), boss.getName());

        Employee john = new Employee("John");

        Assert.assertEquals("Age must be 0", 0, john.getAge());

        Assert.assertEquals("Not initialized static variable must be 0", 0, Employee.num);
    }
}