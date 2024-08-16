public class Relational {
    public static void main(String[] args) throws Exception {
        String nameOne = "MyName";
        String nameTwo = new String("MyName"); //different object

        System.out.println(nameOne.equals(nameTwo)); //comparating the value of two differents objects
        
        System.out.println(nameOne == nameTwo); //false because are two diffents objects


        int numberOne = 1;
        int numberTwo = 2;

        boolean yesNo = numberOne == numberTwo;

        if (numberOne < numberTwo) {
            System.out.println("Our condition is true.");
        }

        System.out.println("Number one is equal to number two? " + yesNo);
        
        yesNo = numberOne != numberTwo;
        System.out.println("Number one is diferent to number two? " + yesNo);
        
        yesNo = numberOne > numberTwo;
        System.out.println("Number one is bigger than number two? " + yesNo);
    }

}
