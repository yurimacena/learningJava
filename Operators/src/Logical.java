public class Logical {
    public static void main(String[] args) throws Exception {
        boolean condition1 = true;

        boolean condition2 = true;

        if (condition1 && (7>4)) {
            System.out.println("These two conditions are true.");
        }

        if (condition1 || condition2) {
            System.out.println("One of these conditions are true.");
        }

        System.out.println("End.");
    }
}
