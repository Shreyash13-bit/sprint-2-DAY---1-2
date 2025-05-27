import java.util.*;
import java.util.function.Predicate;
public class main4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Predicate<Integer> isEven = n -> n % 2 == 0;
        numbers.removeIf(isEven);
        System.out.println("List after removing even numbers: " + numbers);
    }
}
