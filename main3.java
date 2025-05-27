import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Jack", "Bob", "Jill", "Steve");

        // Define the predicate
        Predicate<String> startsWithJ = name -> name.startsWith("J");

        // Use stream to filter names
        List<String> filteredNames = names.stream()
                                          .filter(startsWithJ)
                                          .collect(Collectors.toList());

        // Output the result
        System.out.println("Names starting with J: " + filteredNames);
    }
}
