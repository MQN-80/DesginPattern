package AdapterPattern;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        // 充值5人民币
        Rmb rmb = new Rmb(5);
        // 人民币转游戏币并计算能够开启游戏场数
        new GameCurrency(rmb).calculate();
    }
}
