@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}
public class main {
    public static int execute(int a, int b, Operation op) {
        return op.operate(a, b);
    }
    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation multiply = (x, y) -> x * y;
        System.out.println("Addition: " + execute(10, 5, add));         // Output: 15
        System.out.println("Multiplication: " + execute(10, 5, multiply)); // Output: 50
    }
}
