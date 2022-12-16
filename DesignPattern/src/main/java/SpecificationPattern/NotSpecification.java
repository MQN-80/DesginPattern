package SpecificationPattern;

public class NotSpecification extends CompositeSpecification{
    // 传递一个规格书
    private ISpecification spec;

    public NotSpecification(ISpecification spec) {
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return this.isSatisfiedBy(spec);
    }
}
