import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List listWithoutGenerics = new ArrayList();
        listWithoutGenerics.add("Element 1");
        listWithoutGenerics.add(10);

        List<String> listGenerics = new ArrayList<>();
        listGenerics.add("Element 1");
        listGenerics.add("Element 2");

        //iterating about the list with Generics
        for (String element: listGenerics) {
            System.out.println(element);
        }
        //iterating about the list without Generics (cast necessary)
        for (Object element : listWithoutGenerics) {
            String str = (String) element;
            System.out.println(str);
        }
    }
}
