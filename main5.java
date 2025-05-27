import java.util.*;
import java.util.function.Consumer;
public class main5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alice", "jack");
        Consumer<List<String>> printUppercase = list -> {
            for (String name : list) {
                System.out.println(name.toUpperCase());
            }
        };
        printUppercase.accept(names);
    }
}
