package CallbackPattern;

public class ReturnTicket extends ThreadHolder {
    @Override
    public void run() throws InterruptedException {
        System.out.println("正在退票。。。");
        Thread.sleep(100);
        System.out.println("手续完成！");
    }
}
