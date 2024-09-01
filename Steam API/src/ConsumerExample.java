
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerExample {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

    Consumer<Integer> printEvenNumber = number -> {
        if (number % 2 == 0) {
            System.out.println(number);
        }

        numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
    };
}
