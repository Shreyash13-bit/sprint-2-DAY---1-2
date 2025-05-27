import java.util.*;
public class main6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Programming", "is", "fun");
        words.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted by length: " + words);
    }
}
