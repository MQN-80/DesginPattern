package FacadePattern;

public class Projector {
    private static Projector instance = new Projector();
    public static Projector getInstance() {
        return instance;
    }
    public void on() {
        System.out.println(" 投影仪打开了 ");
    }
    public void off() {
        System.out.println(" 投影仪关闭了 ");
    }
    public void focus() {
        System.out.println(" 投影仪聚焦 ");
    }
    public void zoom() {
        System.out.println(" 投影仪放大 ");
    }
}
