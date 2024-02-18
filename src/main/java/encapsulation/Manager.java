package encapsulation;

public class Manager extends Employee {

    public Manager() {
        super("Test");
    }

    public Manager(String name, int age) {
        super(name, age);
    }

    public String show() {
        return String.format("%sTest", super.getName());
    }
    /*
    I can not override the showAgain declared in super class    
    public String showAgain() {
        return "ha";
    }*/

    protected static class CEO {
        String name = "CEO";
    }

    protected class CTO {
        String name = "CTO";
    }
}
