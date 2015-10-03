/**
 * Created by Katy on 10/3/15.
 */
public class Temperature implements Notification {
    private Message MyMessage;
    private String MessageTitle;

    public Temperature(Message message){
        MyMessage = message;
        MessageTitle = "Temperature";
    }

    public Message GetMessage(){
        return this.MyMessage;
    }

    public String PrintMessage(){
        return this.MyMessage.GetMessage();
    }

    public String GetMessageType() {
        return this.MessageTitle;
    }
}
