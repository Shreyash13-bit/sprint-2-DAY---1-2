interface InterfaceA {
    default void run() {
        System.out.println("Running from InterfaceA");
    }
}
interface InterfaceB {
    default void run() {
        System.out.println("Running from InterfaceB");
    }
}
public class main7 implements InterfaceA, InterfaceB {
    @Override
    public void run() {
        InterfaceA.super.run();
        InterfaceB.super.run();
        System.out.println("Resolved in Main class");
    }
    public static void main(String[] args) {
        main7 obj = new main7();
        obj.run();
    }
}
