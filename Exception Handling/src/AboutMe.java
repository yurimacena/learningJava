import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.CANADA);

            System.out.println("Type your name:");
            String name = scanner.next();

            System.out.println("Type your surname:");
            String surname = scanner.next();

            System.out.println("Type your age:");
            int age = scanner.nextInt();

            System.out.println("Type your height:");
            double height = scanner.nextDouble();

            System.out.println("Hello, " + name.toUpperCase() + " " + surname);
            System.out.println("Your age is " + age);
            System.out.println("Your height is " + height + "cm");
            scanner.close();
        } catch(InputMismatchException Mismatch){
            System.err.println("Age and height area need to be numerics.");
        }
    }
}
