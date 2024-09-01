
import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        words.stream()
            .filter( p -> p.length() > 5)
            .forEach(System.out::println);
    }
}
