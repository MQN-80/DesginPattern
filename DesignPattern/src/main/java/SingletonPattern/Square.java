package SingletonPattern;

public class Square {
    String name;
    private static final Square instance = new Square("");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Square(String name){
        this.name=name;
    }
    public static Square getInstance() {
        return instance;
    }
}
