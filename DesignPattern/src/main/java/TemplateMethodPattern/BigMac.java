package TemplateMethodPattern;

// 巨无霸
public class BigMac extends Hamburger {
    public BigMac() {
        this.burgerName = "Big Mac";
    }

    @Override
    public void greens() {
        System.out.println("加入生菜、酸黄瓜和番茄");
    }

    @Override
    public void meat() {
        System.out.println("加入巨无霸双层牛肉饼");
    }

    @Override
    public void sauce() {
        System.out.println("加入巨无霸酱");
    }
}
