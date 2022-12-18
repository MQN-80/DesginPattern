package SpecificationPattern;

public interface ISpecification {
    /**
     * 候选者是否满足需求
     *
     * @param candidate
     * @return
     */
    boolean isSatisfiedBy(Object candidate);

    /**
     * and操作
     *
     * @param spec
     * @return
     */
    ISpecification and(ISpecification spec);

    /**
     * or操作
     *
     * @param spec
     * @return
     */
    ISpecification or(ISpecification spec);

    /**
     * not操作
     *
     * @return
     */
    ISpecification not();
}
