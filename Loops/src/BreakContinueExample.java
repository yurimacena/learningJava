public class BreakContinueExample {
    public static void main(String[] args) {
        for (int number = 1; number <=8; number++){
            if (number == 3)
                continue;
            else if (number > 5)
                break;
            System.out.println(number);
        }
    }
}
