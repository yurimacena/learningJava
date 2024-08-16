public class Operators {
    public static void main(String[] args) throws Exception{
        String fullName = "Java" + "Language";
        String concatenation = "?";
        
        concatenation = 1+1+1+"1";

        System.out.println(concatenation);

        concatenation = 1+"1"+1+1;

        System.out.println(concatenation);

        concatenation = 1+"1"+1+"1";

        System.out.println(concatenation);

        concatenation = "1"+1+1+1;

        System.out.println(concatenation);

        concatenation = "1"+(1+1+1);

        System.out.println(concatenation);
    }
}
