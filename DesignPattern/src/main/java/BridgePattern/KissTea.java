package BridgePattern;

public class KissTea extends RefinedAbstractTea{ //创建一个啵啵芋圆奶茶的子类
    //在构造时需要指定具体的大小实现
    protected KissTea(Size size,Sweetness sweetness) {
        super(size,sweetness);
    }

    @Override
    public String getType() {
        return "芋泥波波奶茶";   //返回奶茶类型
    }
}
