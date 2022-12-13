package FacadePattern;

public class TheaterClient {
    public static void main(String[] args) {
        TheaterFacade TheaterFacade = new TheaterFacade();
        TheaterFacade.ready(5);
        TheaterFacade.play();
        TheaterFacade.pause();
        TheaterFacade.end();
    }
}
