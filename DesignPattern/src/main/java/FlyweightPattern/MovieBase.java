package FlyweightPattern;

import java.io.IOError;
import java.io.IOException;

// 电影类的抽象接口
public abstract class MovieBase {

    // 享元
    protected String name;
    protected String[] names;

    public MovieBase(String name) {
        this.name = name;
    }

    public MovieBase(String[] names) {
        this.names = names;
    }

    /**
     * @param room 放映厅号
     */
    public abstract void playMovie(String room);
}
