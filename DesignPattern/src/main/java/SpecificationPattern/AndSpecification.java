package SpecificationPattern;

public class AndSpecification extends CompositeSpecification {
    // 传递两个规格书进行and操作
    private ISpecification left;
    private ISpecification right;

    public AndSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return this.left.isSatisfiedBy(candidate) && this.right.isSatisfiedBy(candidate);
    }
}
