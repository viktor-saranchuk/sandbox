package encaapsulation;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public Boolean isEquals(Employee employee) {
        employee.name = this.name;
        return this.name == employee.name;
    }


}