package IteratorPattern;

import java.util.GregorianCalendar;
import java.util.Iterator;

public interface Aggregate //抽象聚合
{
    public void add(Object obj);
    public void remove(Object obj);
    public ConcreteIterator getIterator();

}
