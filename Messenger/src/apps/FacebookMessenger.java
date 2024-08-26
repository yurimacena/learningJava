package apps;
public class FacebookMessenger extends InstatainMessageService {
    @Override
    public void sendingMessage() {
        validateInternetConnection();
        System.out.println("Sending message in Facebook.");
    }
    @Override
    public void receivingMessage() {
        System.out.println("Receiving message in Facebook.");
    }
}
