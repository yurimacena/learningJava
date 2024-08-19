public class MeasurementSystem {
    public static void main(String[] args) {
        String abbreviation = "M";

        switch (abbreviation) {
            case "S":
                System.out.println("Small.");
                break;
            case "M":
                System.out.println("Medium.");
                break;
            case "L":
                System.out.println("Large.");
                break;
            default:
                System.out.println("Undefined.");
        }
    }
}
