package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate implements Aggregate//具体聚合
{
    private List<Object> list=new ArrayList<Object>();
    public void add(Object obj)
    {
        list.add(obj);
    }
    public void remove(Object obj)
    {
        list.remove(obj);
    }
    public ConcreteIterator getIterator()
    {
        return(new ConcreteIterator(list));
    }
}
