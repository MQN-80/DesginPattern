package TemplateMethodPattern;

public class DoubleCheese extends Hamburger{
    @Override
    public void greens() {
        System.out.println("加入芝士和番茄");
    }

    @Override
    public void meat() {
        System.out.println("加入双层牛肉饼");
    }

    @Override
    public void sauce() {
        System.out.println("加入沙拉酱");
    }

    public DoubleCheese() {
        this.burgerName = "Double Cheese";
    }
}
