package AbstractFactoryPattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("KFC抽象工厂测试!");
        KFCabstractFactory kfc =new KFCabstractFactory();

        System.out.println("创建食物制作工厂...");
        kfc.getMake("Cola").make();
        kfc.getMake("Hamburger").make();

        System.out.println("创建送餐工厂...");
        kfc.getGive("Cola").give();
        kfc.getGive("Hamburger").give();
    }
}
