public interface StringUtils {
    static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
    static String capitalize(String s) {
        if (isNullOrEmpty(s)) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
public class Main10 {
    public static void main(String[] args) {
        String test1 = null;
        String test2 = "";
        String test3 = "hello";
        System.out.println(StringUtils.isNullOrEmpty(test1));
        System.out.println(StringUtils.isNullOrEmpty(test2));
        System.out.println(StringUtils.isNullOrEmpty(test3));
        System.out.println(StringUtils.capitalize(test3));
        System.out.println(StringUtils.capitalize(test2));
    }
}
