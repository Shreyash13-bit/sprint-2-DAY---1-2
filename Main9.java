interface MathUtils {
    static int square(int x) {
        return x * x;
    }
}
public class Main9 {
    public static void main(String[] args) {
        int result = MathUtils.square(5);
        System.out.println("Square of 5 is: " + result);
    }
}
