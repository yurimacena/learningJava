
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) throws Exception {
        List<String> saludationsList = Stream.generate(() -> "Hello, world!")
            .limit(3)
            .collect(Collectors.toList());

        saludationsList.forEach(s -> System.out.println(s));
    }
}