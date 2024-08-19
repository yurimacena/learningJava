public class SchoolExam {
    public static void main(String[] args) {
        int result = 5;
        String outcome = result >=7 ? "Approved" : result >=5 && result <7 ? "Recovery exam" : "Reproved";
        
        System.out.println(outcome);
    }
}
