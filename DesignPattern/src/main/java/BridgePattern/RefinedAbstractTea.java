package BridgePattern;

public abstract class RefinedAbstractTea extends AbstractTea{
    protected RefinedAbstractTea(Size size,Sweetness sweetness) {
        super(size,sweetness);
    }

    public String getSize(){   //添加尺寸维度获取方式
        return size.getSize();
    }

    public String getSweetness(){   //添加甜度维度获取方式
        return Sweetness.getSweetness();
    }
}
