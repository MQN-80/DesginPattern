package SpecificationPattern;

public class BizSpecification extends CompositeSpecification{
    // 基准对象
    @SuppressWarnings("unused")
    private Object obj;

    public BizSpecification(Object obj) {
        this.obj = obj;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        for (Object tag:((clothes) candidate).tags) {
            if(tag==this.obj)
                return true;
        }
        return false;
    }
}
