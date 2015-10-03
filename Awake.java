

/**
 * Created by Katy on 10/3/15.
 */
public class Awake implements Notification{
    private Message MyMessage;
    private String MessageTitle;

    public Awake(Message message){
        MyMessage = message;
        MessageTitle = "Awake";
    }

    public Message GetMessage(){
        return this.MyMessage;
    }

    public String PrintMessage(){
        return this.MyMessage.GetMessage();
    }

    public String GetMessageType(){
        return this.MessageTitle;
    }

}
