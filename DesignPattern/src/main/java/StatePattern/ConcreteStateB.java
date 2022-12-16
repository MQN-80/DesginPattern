package StatePattern;

class ConcreteStateB extends State {
    public void Handle(Context context) {
        System.out.println("当前亮度是 60%");
        context.setState(new ConcreteStateC());
    }
}
