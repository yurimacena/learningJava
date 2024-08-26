package apps;

public class Telegram extends InstatainMessageService {
    @Override
    public void sendingMessage() {
        validateInternetConnection();
        System.out.println("Sending message in Telegram.");
    }
    @Override
    public void receivingMessage() {
        System.out.println("Receiving message in Telegram.");
    }
}
