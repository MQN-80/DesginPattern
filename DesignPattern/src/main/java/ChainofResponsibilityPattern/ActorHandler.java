package ChainofResponsibilityPattern;

public class ActorHandler extends Handler {

    @Override
    public void handlerRequest(String request) {
        if(request.equals("服务员面试"))
            System.out.println("ActorHandler处理服务员面试请求");
        else if (getNextHandler() != null) {
            System.out.println("ActorHandler无法处理该请求，交给下一个Handler");
            getNextHandler().handlerRequest(request);
        }
        else{
            System.out.println("此责任链无法处理该请求");
        }
    }
}
