package IteratorPattern;

public interface Iterator //抽象迭代器
{
    Object begin();// 迭代器首部
    Object end();// 迭代器尾部
    Object next();// 迭代器自增
    boolean hasNext();// 判断序列中是否还有元素

    boolean remove();// 删除迭代器返回的元素

    Object getObject();// 返回当前元素
}
