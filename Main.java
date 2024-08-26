public class Main {
    //execution stack
    public static void main(String[] args) {
        System.out.println("The program strated in the main method.");
        a();
        System.out.println("The program finished in the main method.");
    }

    static void a() {
        System.out.println("Entered in the method a.");
        b();
        System.out.println("Finished the method a.");
    }

    static void b() {
        System.out.println("Entered in the method b.");
        for (int i = 0; i <= 4 ; i++) System.out.println(i);
        c();
        System.out.println("Finished the method b.");
    }

    static void c() {
        System.out.println("Entered in the method c.");
        //Thread.dumpStack();
        System.out.println("Finished the method c.");
    }   
    
}
