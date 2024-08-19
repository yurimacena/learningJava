public class ForExampleArray {
    public static void main(String[] args) {
        String students [] = {"Phillip", "John", "Julius", "Marcus"};

        for (int x =0; x < students.length; x++) {
            System.out.println("The student in index x=" + x + " is " + students [ x ]);
        }

        System.out.println("\n");
        
        String fruits [] = {"Watermeloon", "Limon", "Apple"};

        for (String fruit: fruits) {
            System.out.println("The name of the fruit is: " + fruit);
        }
    }
}
