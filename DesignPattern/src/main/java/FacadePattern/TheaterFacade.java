package FacadePattern;

public class TheaterFacade {
    private Player player;
    private Screen screen;
    private Stereo stereo;
    private Projector projector;

    //构造器
    public TheaterFacade() {
        this.player = Player.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();

    }

    //一致界面
    public void ready(int voice) {
        System.out.println("===ready===");
        screen.down();
        player.on();
        stereo.on();
        stereo.setVolume(voice);
        projector.on();
        projector.zoom();
        projector.focus();
    }
    public void play() {
        System.out.println("===play===");
        player.play();
    }
    public void pause() {
        System.out.println("===pause===");
        player.pause();
    }
    public void end() {
        System.out.println("===end===");
        screen.up();
        projector.off();
        stereo.off();
        player.off();
    }
}
