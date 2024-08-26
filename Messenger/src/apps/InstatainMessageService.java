package apps;
public abstract class InstatainMessageService {
    public abstract void sendingMessage();
    public abstract void receivingMessage();

    protected void validateInternetConnection() {
        System.out.println("Validating internet connection.");
    }
}
