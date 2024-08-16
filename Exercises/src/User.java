public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        smartTV.decreaseSound();
        smartTV.decreaseSound();
        smartTV.decreaseSound();
        smartTV.increaseSound();

        System.out.println("Actual sound: " + smartTV.sound);

        System.out.println("Actual channel: " + smartTV.channel);
        smartTV.changeChannel(13);
        System.out.println("Actual channel: " + smartTV.channel);

        System.out.println("TV is on? " + smartTV.TVIsOn);
        System.out.println("Actual channel? " + smartTV.channel);
        System.out.println("Actual sound? " + smartTV.sound);
        
        smartTV.turnOn();
        System.out.println("New status -> TV is on? " + smartTV.TVIsOn);

        smartTV.turnOff();
        System.out.println("New status -> TV is off? " + smartTV.TVIsOn);

    }
}
