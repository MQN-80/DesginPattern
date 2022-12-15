package DecoratePattern;

public class DecoratorClient {
    public static void main(String[] args) {
        Decorator basicHamburger=new Decorator(20);  //new1个20元的基础汉堡
        lettuceDecotator lettuce=new lettuceDecotator(basicHamburger,2);
        MeatDecorator meat=new MeatDecorator(lettuce,2);
        System.out.println(meat.makeHamburger());
        System.out.println("总价格为"+meat.getPrice()+"元");
    }
}
