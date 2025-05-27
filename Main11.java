@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
public class Main11 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        System.out.println("Addition: " + add.operate(10, 5));      // 15
        System.out.println("Subtraction: " + subtract.operate(10, 5)); // 5
        System.out.println("Multiplication: " + multiply.operate(10, 5)); // 50
    }
}
