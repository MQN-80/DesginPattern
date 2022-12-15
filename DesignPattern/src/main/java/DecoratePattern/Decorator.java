package DecoratePattern;

public class Decorator extends IDecorator {
    private Integer price;   //汉堡的基础价格
    public Decorator(Integer price){
        this.price=price;
    }
    public int getPrice(){
        return this.price;
    }
    @Override
    public String makeHamburger(){
        return "制作基础汉堡";
    }

}
