package FacadePattern;

public class Stereo {
    private static Stereo instance = new Stereo();

    private Integer Voice;
    public static Stereo getInstance() {
        return instance;
    }
    public void on() {
        System.out.println(" 音响打开了 ");
    }
    public void off() {
        System.out.println(" 音响关闭了 ");
    }
    public void setVolume(int voice) {
        Voice=voice;
        System.out.println(" 音响音量调节为"+voice);
    }
}
