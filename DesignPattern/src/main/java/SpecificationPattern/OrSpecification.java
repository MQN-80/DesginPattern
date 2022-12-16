package SpecificationPattern;

public class OrSpecification extends CompositeSpecification{
    // 左右两个规格书
    private ISpecification left;
    private ISpecification right;

    public OrSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return this.left.isSatisfiedBy(candidate) || this.right.isSatisfiedBy(candidate);
    }
}
