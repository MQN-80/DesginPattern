package CommandPattern;

public class BurgerOnCommand implements Command {
    //聚合BurgerReceiver

    BurgerReceiver burger;

    //构造器
    public BurgerOnCommand(BurgerReceiver burger) {
        super();
        this.burger = burger;
    }

    @Override
    public void execute() {

        //调用接收者的方法
        burger.on();
    }



    @Override
    public void undo() {

        //调用接收者的方法
        burger.off();
    }

}
