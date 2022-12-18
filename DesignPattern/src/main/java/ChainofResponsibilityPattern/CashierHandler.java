package ChainofResponsibilityPattern;

public class CashierHandler extends Handler{
    public void handlerRequest(String request) {
        if(request.equals("收银员面试"))
            System.out.println("CashierHandler处理收银员面试请求");
        else if (getNextHandler() != null) {
            System.out.println("CashierHandler无法处理该请求，交给下一个Handler");
            getNextHandler().handlerRequest(request);
        }
        else{
            System.out.println("此责任链无法处理该请求");
        }
    }
}
