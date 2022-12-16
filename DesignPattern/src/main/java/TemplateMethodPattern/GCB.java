package TemplateMethodPattern;

public class GCB extends Hamburger {
    @Override
    public void greens() {
        System.out.println("加入生菜");
    }

    @Override
    public void meat() {
        System.out.println("加入板烧鸡腿");
    }

    @Override
    public void sauce() {
        System.out.println("加入板烧酱");
    }

    public GCB() {
        this.burgerName = "GCB";
    }
}
