package encapsulation;

public class Outer {

    public class Inner {
        public static void doSomething() {
            System.out.println("Inner: static doSomething");
        }
    }
    
    public static class InnerStatic {
        public static void doSomething() {
            System.out.println("InnerStatic: static doSomething");
        }
    }
}
