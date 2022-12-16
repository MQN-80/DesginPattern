package CommandPattern;

public class Test {
    public static void main(String[] args) {

        //创建汉堡的对象(接受者)
        BurgerReceiver burgerReceiver = new BurgerReceiver();

        //创建汉堡相关的开关命令
        BurgerOnCommand burgerOnCommand = new BurgerOnCommand(burgerReceiver);
        BurgerOffCommand burgerOffCommand = new BurgerOffCommand(burgerReceiver);

        //需要一个contrller
        Controller controller = new Controller();

        //给contrller设置命令
        controller.setCommand(0, burgerOnCommand, burgerOffCommand);
        System.out.println("=========订购汉堡==========");

        System.out.println("--------按下汉堡的订购按钮-----------");
        controller.onButtonWasPushed(0);
        System.out.println("--------按下汉堡的取消订购按钮-----------");
        controller.offButtonWasPushed(0);
        System.out.println("--------按下撤销按钮-----------");
        controller.undoButtonWasPushed();


        System.out.println("=========订购薯条==========");

        ChipsReceiver chipsReceiver = new ChipsReceiver();

        ChipsOffCommand chipsOffCommand = new ChipsOffCommand(chipsReceiver);
        ChipsOnCommand chipsOnCommand = new ChipsOnCommand(chipsReceiver);

        //设置命令
        controller.setCommand(1, chipsOnCommand, chipsOffCommand);

        System.out.println("--------按下薯条的订购按钮-----------");
        controller.onButtonWasPushed(1);
        System.out.println("--------按下薯条的取消订购按钮-----------");
        controller.offButtonWasPushed(1);
        System.out.println("--------按下撤销按钮-----------");
        controller.undoButtonWasPushed();

    }
}
