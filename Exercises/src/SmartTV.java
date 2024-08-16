public class SmartTV {
    boolean TVIsOn = false;
    int sound = 10;
    int channel = 1;

    public void changeChannel (int newChannel) {
        channel = newChannel;
    }
    
    public void increaseChannel() {
        channel++;
    }

    public void decreaseChannel() {
        channel--;
    }

    public void turnOn() {
        TVIsOn = true;
    }

    public void turnOff() {
        TVIsOn = false;
    }
    
    public void increaseSound() {
        sound++;
        System.out.println("Increasing the sound for: " + sound);
    }

    public void decreaseSound() {
        sound--;
        System.out.println("Decreasing the sound for: " + sound);
    }
}
