package FactoryPattern;

public class factoryClient {
    public static void main(String[] args) {
        System.out.println("KFC食物工厂测试!");
        KFCFactory factory=new KFCFactory();
        System.out.println("制作一份可乐(Cola)：");
        factory.getMake("Cola").make();

        System.out.println("制作一份薯条(FrenchFries)：");
        factory.getMake("FrenchFries").make();

        System.out.println("制作一份汉堡(Hamburger)：");
        factory.getMake("Hamburger").make();
    }
}
