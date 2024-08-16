package edu.yuri.firstweek;
public class MyClass {
    public static void main (String [] args) {
        System.out.println ("Hello, world! Be welcome.");

        String firstName = "Yuri";
        String secondName = "M.";

        String fullName = fullName (firstName, secondName);
        System.out.println(fullName);
    }
    
    public static String fullName (String firstName, String secondName) {
        return "Method result: " + firstName.concat(" ").concat(secondName);
    }
}