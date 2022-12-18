package BridgePattern;

public class OreoTea extends RefinedAbstractTea{

    protected OreoTea(Size size,Sweetness sweetness) {
        super(size, sweetness);
    }

    @Override
    public String getType() {
        return "奥利奥奶茶";
    }
}
