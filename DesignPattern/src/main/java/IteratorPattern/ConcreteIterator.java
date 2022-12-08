package IteratorPattern;

import java.util.List;

public class ConcreteIterator implements Iterator//具体迭代器
{
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public Object begin() {
        index = 0;
        Object obj = list.get(index);
        return obj;
    }

    public Object end()
    {
        index =list.size();
        Object obj =list.get(index-1);
        return obj;
    }
    public Object next()
    {
        Object obj=null;
        if(this.hasNext())
        {
            obj=list.get(++index);
        }
        return obj;
    }

    public boolean remove()
    {
        if(index<list.size()-1)
        {
            list.remove(index--);
            return true;
        }
        return false;
    }

    public Object getObject()
    {
        return list.get(index);
    }
}
