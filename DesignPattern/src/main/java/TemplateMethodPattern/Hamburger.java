package TemplateMethodPattern;

public abstract class Hamburger {

    public String burgerName;

    public String getBurgerName() {
        return burgerName;
    }

    public final void makingBurger() {
        this.bread();
        this.meat();
        this.sauce();
        this.greens();
    }

    public void bread() {
        System.out.println("放置面包底");
    }

    public abstract void greens();

    public abstract void meat();

    public abstract void sauce();
}
