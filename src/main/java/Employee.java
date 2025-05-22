import java.util.Objects;

public class Employee {
    public static String defaultName = "John Doe";

    private String name;

    public Employee(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
    }

    public String getName() {
        return name;
    }

    public boolean compareTo(Employee other) {
        return this.name.equals(other.name);
    }
}
