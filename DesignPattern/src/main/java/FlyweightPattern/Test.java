package FlyweightPattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("享元模式测试：");

        MovieFactory movieFactory = MovieFactory.getInstance();
        Movie movie1 = movieFactory.getMovie("Mine");
        movie1.playMovie("1");
        Movie movie2 = movieFactory.getMovie("Red");
        movie2.playMovie("2");
        Movie movie3 = movieFactory.getMovie("Mine");
        movie3.playMovie("3");
        Movie movie4 = movieFactory.getMovie("Mine");
        movie4.playMovie("4");
        Movie movie5 = movieFactory.getMovie("White");
        movie5.playMovie("5");
        Movie movie6 = movieFactory.getMovie("Red");
        movie6.playMovie("6");
    }
}
