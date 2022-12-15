package FacadePattern;

public class Player {
    private static Player instance = new Player();//使用单例模式(饿汉式)
    public static Player getInstance() {
        return instance;
    }
    public void on() {
        System.out.println(" 播放器打开了 ");
    }
    public void off() {
        System.out.println(" 播放器关闭了 ");
    }
    public void play() {
        System.out.println(" 播放器播放中 ");
    }
    public void pause() {
        System.out.println(" 播放暂停 ");
    }
}
