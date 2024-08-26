import apps.FacebookMessenger;
import apps.InstatainMessageService;
import apps.MSNMessenger;
import apps.Telegram;

public class UserComputer {
    public static void main(String[] args) {
        //polymorphism
        InstatainMessageService ims = null;

        String selectedApp = "fcb";

        if(selectedApp.equals("msn"))
            ims = new MSNMessenger();
        else if(selectedApp.equals("tlg"))
            ims = new Telegram();
        else if(selectedApp.equals("fcb"))
            ims = new FacebookMessenger();
        
        ims.sendingMessage();
        ims.receivingMessage();
    }
}
