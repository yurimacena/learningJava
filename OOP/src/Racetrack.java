public class Racetrack {
    public static void main(String[] args) {
        Car jeep = new Car();
        jeep.setChassi("897897");
        //jeep.on();

        Motorcycle z400 = new Motorcycle();
        z400.setChassi("467754");
        //z400.on();

        Vehicle joker = jeep;

        joker.on();
    }
}
