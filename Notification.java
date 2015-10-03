
/**
 * Created by Katy on 10/3/15.
 */
public interface Notification {


    /* What will be the message sent in the notification?
     * @param message msg to send
     */
    public Message GetMessage();


    public String PrintMessage();


    /*Return the type of notification it is*/
    public String GetMessageType();




}
