public class OtherOperatorsExamples {
    public static void main(String[] args) {
        int number = 5;
        number = - number; // turned into negative

        System.out.println(number);

        number = number * -1; // turned into positive
        System.out.println(number);

        //x repetition
        int otherNumber = 5;
        //otherNumber = otherNumber + 1;
        System.out.println(++otherNumber);

        boolean variable = false;
        System.out.println(!variable);

        variable = !variable; //this is the format for invert boolean values 
        System.out.println(variable);
    }
}