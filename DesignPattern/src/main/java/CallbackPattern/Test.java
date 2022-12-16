package CallbackPattern;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Callback_Ticket m =new Callback_Ticket();
        ReturnTicket R =new ReturnTicket();

        R.run(m);
    }
}
