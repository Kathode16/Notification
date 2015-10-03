
/**
 * Created by Katy on 10/3/15.
 */
public class HeartRate implements Notification {
    private Message MyMessage;
    private String MessageTitle;


    public HeartRate(Message message){
        MyMessage = message;
        MessageTitle = "Heart Rate";
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
