package ChainofResponsibilityPattern;

public class JanitorHandler extends Handler{
    public void handlerRequest(String request) {
        if(request.equals("清洁工面试"))
            System.out.println("JanitorHandler处理清洁工面试请求");
        else if (getNextHandler() != null) {
            System.out.println("JanitorHandler无法处理该请求，交给下一个Handler");
            getNextHandler().handlerRequest(request);
        }
        else{
            System.out.println("此责任链无法处理该请求");
        }
    }
}
