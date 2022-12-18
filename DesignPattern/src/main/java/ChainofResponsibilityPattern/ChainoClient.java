package ChainofResponsibilityPattern;

public class ChainoClient {
    public static void main(String[] args){
        ActorHandler h1=new ActorHandler();
        CashierHandler h2=new CashierHandler();
        JanitorHandler h3=new JanitorHandler();
        SecurityHandler h4=new SecurityHandler();
        h1.setNextHandler(h2);
        h2.setNextHandler(h3);
        h3.setNextHandler(h4);

        System.out.println("面试责任链创建完毕，共包含4个Handler");
        System.out.println("传入收银员面试请求");
        h1.handlerRequest("收银员面试");
        System.out.println("传入保安面试请求");
        h1.handlerRequest("保安面试");
        System.out.println("传入店长面试请求");
        h1.handlerRequest("店长面试");
    }
}
