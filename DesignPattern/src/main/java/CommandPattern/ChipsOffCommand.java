package CommandPattern;

public class ChipsOffCommand implements Command {
    // 聚合chipsReceiver

    ChipsReceiver chips;

    // 构造器
    public ChipsOffCommand(ChipsReceiver chips) {
        super();
        this.chips = chips;
    }

    @Override
    public void execute() {

        // 调用接收者的方法
        chips.off();
    }

    @Override
    public void undo() {

        // 调用接收者的方法
        chips.on();
    }

}
