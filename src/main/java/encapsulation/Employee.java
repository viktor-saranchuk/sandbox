package encapsulation;

public class Employee {

    public static int num;

    private String name;
    private int age;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void replaceName(Employee employee) {
        // Encapsulation flaw
        employee.name = this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show() {
        return String.format("ta-daaa (%s)", this.name);
    }

    public final String showAgain() {
        return "nah";
    }
}