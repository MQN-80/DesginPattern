package StatePattern;


class ConcreteStateA extends State {
    public void Handle(Context context) {
        System.out.println("当前亮度是 100%");
        context.setState(new ConcreteStateB());
    }
}
