package AbstractFactoryPattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("KFC抽象工厂测试!");
        KFCFactoryProducer kfc =new KFCFactoryProducer();

        System.out.println("创建食物制作工厂...");
        AbstarctFactory MK=kfc.getFactory("Make");
        MK.getMake("Cola").make();
        MK.getMake("Hamburger").make();

        System.out.println("创建送餐工厂...");
        AbstarctFactory GV=kfc.getFactory("Give");
        GV.getGive("Cola").give();
        GV.getGive("Hamburger").give();
    }
}
