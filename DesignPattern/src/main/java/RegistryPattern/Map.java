package RegistryPattern;


import java.util.ArrayList;
import java.util.List;

public class Map {

    List<Registry> list=new ArrayList<>();
    public Map()
    {
        list.add(new Registry("公交车站","基础设施"));
        list.add(new Registry("停车场","基础设施"));
        list.add(new Registry("洗手间","基础设施"));
        list.add(new Registry("共享单车","基础设施"));
        list.add(new Registry("广播","基础设施"));
        list.add(new Registry("公告栏","基础设施"));
        list.add(new Registry("自动售货机","基础设施"));
        list.add(new Registry("银行","基础设施"));
        list.add(new Registry("纯K","娱乐"));
        list.add(new Registry("电影院","娱乐"));
        list.add(new Registry("电竞厅","娱乐"));
        list.add(new Registry("游戏厅","娱乐"));
        list.add(new Registry("奶茶店","餐饮"));
        list.add(new Registry("电脑店","购物"));
        list.add(new Registry("药店","医疗"));
        list.add(new Registry("优衣库","购物"));
    }

    public void printMap()
    {
        for(Registry registry :list)
        {
            System.out.println(registry.getName()+" "+registry.getType());
        }

    }
}
