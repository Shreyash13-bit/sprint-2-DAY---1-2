import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class main3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Jack", "Bob", "Jill", "Steve");
        Predicate<String> startsWithJ = name -> name.startsWith("J");
        List<String> filteredNames = names.stream()
                                          .filter(startsWithJ)
                                          .collect(Collectors.toList());
        System.out.println("Names starting with J: " + filteredNames);
    }
}
