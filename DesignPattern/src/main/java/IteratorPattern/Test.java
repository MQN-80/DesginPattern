package IteratorPattern;

public class Test {
    public static void main(String[] args)
    {
        Aggregate aggregate=new ConcreteAggregate();
        aggregate.add("聚合内容1");
        aggregate.add("聚合内容2");
        aggregate.add("聚合内容3");
        aggregate.add("聚合内容4");
        System.out.print("聚合的内容有：");
        Iterator it=aggregate.getIterator();
        while(it.hasNext())
        {
            Object ob=it.next();
            System.out.print(ob.toString()+"\t");
        }
        Object object=it.begin();
        System.out.println("\n\n第一个元素为："+object.toString());
        it.next();
        it.remove();
        System.out.println("\n删去第二个元素后，当前指向的元素是："+it.getObject());
        System.out.print("\n现在聚合的内容有：");
        Iterator iterator=aggregate.getIterator();
        while(iterator.hasNext())
        {
            Object object1=iterator.next();
            System.out.print(object1.toString()+"\t");
        }
        System.out.println("\n\n现在的尾部是："+iterator.end());
    }
}
