/**
 * Created by Katy on 10/3/15.
 */
public class NotifDriver {


    public static void main(String [] args){

        Message BabyAwake = new Message("The baby has awoken");
        Notification Awake = new Awake(BabyAwake);

        System.out.print(Awake.PrintMessage());

    }
}
