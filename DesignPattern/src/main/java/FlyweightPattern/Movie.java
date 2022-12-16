package FlyweightPattern;

import java.io.IOException;

public class Movie extends MovieBase {
    public Movie(String name) {
        super(name);
    }

    public Movie(String[] names) {
        super(names);
    }

    @Override
    public void playMovie(String room) {
        System.out.println(this.getClass().toString()
                + "play"
                + String.valueOf(System.identityHashCode(this)
                + room
                + "号放映厅正在播放"
                + this.name));
    }

}
