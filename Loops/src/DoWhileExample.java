import java.util.Random;
public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("Calling...");

        do {
            System.out.println("Telephone is calling.");
        } while (calling());
        System.out.println("Hello!");
    }

    private static boolean calling() {
        boolean answered = new Random().nextInt(3)==1;
        System.out.println("Answered? " + answered);
        return ! answered;
    }
    
}
