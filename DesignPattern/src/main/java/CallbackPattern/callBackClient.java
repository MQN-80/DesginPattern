package CallbackPattern;

public class callBackClient {
    public static void main(String[] args) throws InterruptedException {
        Callback_Ticket m =new Callback_Ticket();
        ReturnTicket R =new ReturnTicket();

        R.run(m);
    }
}
