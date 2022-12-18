package BridgePattern;

public abstract class AbstractTea {
    //尺寸作为桥接属性存放在类中
    protected Size size;
    protected Sweetness Sweetness;

    //在构造时需要知道尺寸属性
    protected AbstractTea(Size size,Sweetness sweetness){
        this.size = size;
        this.Sweetness = sweetness;
    }


    //具体类型依然是由子类决定
    public abstract String getType();
}
