package StatePattern;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(); //创建环境
        context.Handle(); //处理请求
        System.out.println("客人A觉得太亮了");
        context.Handle();
        System.out.println("客人A觉得太亮了");
        context.Handle();
        System.out.println("客人A觉得刚刚好");
    }
}
