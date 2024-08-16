import java.util.Date;

public class TypesOfVariables {
    public static void main(String[] args) throws Exception {
        //primitive types
        //study the string class that represents text in the application  
        
        double maximumSalary = 2500; //two thousand five hundred
        double minimumSalary = 2.500; //two point five

        System.out.println("Maximum salary: " + maximumSalary);
        System.out.println("Minimum salary: " + minimumSalary);

        final double PI_VALUE = 3.14; //final in the beginning of the class indicates that class is immutable and the name in caps lock is a convention

        System.out.println("Pi value: " + PI_VALUE);
        
        String name = "Yuri";
        int age = 16;
        double weight = 68.5;
        char sex = 'M';
        boolean organDonor = false;
        Date actualDate = new Date();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Sex: " + sex);
        System.out.println("Organ donor? " + organDonor);
        System.out.println("Actual date: " + actualDate);
    }
}
