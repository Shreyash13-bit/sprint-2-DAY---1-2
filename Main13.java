import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors
public class Main13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 9, 12, 15, 18, 20);
        Predicate<Integer> divisibleBy2 = n -> n % 2 == 0;
        Predicate<Integer> divisibleBy3 = n -> n % 3 == 0;
        List<Integer> divisibleByBoth = numbers.stream()
                .filter(divisibleBy2.and(divisibleBy3))
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by both 2 and 3: " + divisibleByBoth);
        List<Integer> divisibleBy2Or3 = numbers.stream()
                .filter(divisibleBy2.or(divisibleBy3))
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 2 or 3: " + divisibleBy2Or3);
    }
}
