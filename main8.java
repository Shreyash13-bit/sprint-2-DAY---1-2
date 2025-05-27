interface Greeting {
    default void sayHello() {
        System.out.println("Hello from Greeting interface");
    }
}

public class main8 implements Greeting {

    @Override
    public void sayHello() {
        // Call the default method from the interface
        Greeting.super.sayHello();
        System.out.println("Hello from Main class");
    }

    public static void main(String[] args) {
        main8 obj = new main8();
        obj.sayHello();
    }
}
