import java.util.*;
import java.util.function.Consumer;
public class Main14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> doubleAndPrint = n -> System.out.println(n * 2);
        numbers.forEach(doubleAndPrint);
}
}
