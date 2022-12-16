package StatePattern;

public class ConcreteStateC extends State{
    public void Handle(Context context) {
        System.out.println("当前亮度是 20%");
        context.setState(new ConcreteStateA());
    }
}
