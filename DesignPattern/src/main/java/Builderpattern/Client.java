package Builderpattern;

public class Client {
    public static void main(String[] args) {
        //导向器
        Director director = new Director();
        //建造者
        ComputerBuilder builder = new ComputerBuilder();
        //产品
        System.out.println("顾客1，看中了高端电脑");
        director.highComputer(builder);
        builder.getMyComputer();
        System.out.println("顾客2，看中了低端电脑");
        director.lowComputer(builder);
        builder.getMyComputer();
        System.out.println("顾客3，看中了中端电脑");
        director.MiddleComputer(builder);
        builder.getMyComputer();
        System.out.println("顾客4，希望按照自己的意愿定制比亚迪");
        builder.setCpu(new Cpu("高端Cpu"));
        builder.setGpu(new Gpu("高端Gpu"));
        builder.setRam(new Ram());//低端轮胎
        builder.getMyComputer();
    }
}
