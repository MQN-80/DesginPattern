package FlyweightPattern;

import java.util.HashMap;

public class MovieFactory {
    private final HashMap<String, Movie> pool = new HashMap<String, Movie>();
    private MovieFactory() {}

    static MovieFactory movieFactory = new MovieFactory();

    public static MovieFactory getInstance() {
        return movieFactory;
    }

    public Movie getMovie(String name) {
        Movie movie = (Movie)pool.get(name);
        if (null == movie) {
            movie = new Movie(name);
            pool.put(name, movie);
            System.out.println("新增电影: " + name);
        }
        return pool.get(name);
    }
}
