package apps;
public class MSNMessenger extends InstatainMessageService{
    @Override
    public void sendingMessage() {
        validateInternetConnection();
        System.out.println("Sending message in MSNMessenger.");
    }
    @Override
    public void receivingMessage() {
        System.out.println("Receiving message in MSNMessenger.");
    }
}
