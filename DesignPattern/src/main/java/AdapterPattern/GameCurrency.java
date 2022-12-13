package AdapterPattern;

/**
 * 适配器：游戏币
 * 通过依赖Rmb并且实现IGameProps接口，达到适配的目的
 */
public class GameCurrency implements IGameProps{
    /**
     * 人民币对象的引用
     */
    private Rmb rmb;

    /**
     * 游戏币面值
     */
    private int count;

    public GameCurrency(Rmb rmb) {
        this.rmb = rmb;
        // 1人民币等于10游戏币
        this.count = rmb.getCount() * 10;
    }

    @Override
    public void calculate() {
        System.out.println("您拥有游戏币: " + this.getCount() +
                ", 可以玩游戏(单价2游戏币): " + this.getCount() / 2 + "场");
    }

    public int getCount() {
        return count;
    }
}
