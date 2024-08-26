public class Car extends Vehicle { //inherance
    //encapsulation
    @Override
    public void on() {
        checkCombustible();
        checkOver();
        System.out.println("Car is on.");
    }
    private void checkCombustible() {
        System.out.println("Checking combustible.");
    }
    private void checkOver() {
        System.out.println("Checking over in P.");
    }
}