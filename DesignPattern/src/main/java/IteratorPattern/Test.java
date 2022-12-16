package IteratorPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> List = new HashMap<>();
        List.put(1, "纯K");
        List.put(2, "电影院");
        List.put(3, "电竞厅");
        List.put(4, "麦当劳");
        List.put(5, "肯德基");
        List.put(6, "商城");
        List.put(7, "奶茶店");
        List.put(8, "电脑店");
        List.put(9, "药店");
        List.put(10, "优衣库");
        Aggregate aggregate = new ConcreteAggregate();
        boolean judge = true;
        System.out.println("导游系统开始运行！请选择你想要去往的地点，本系统将自动为你添加行程");
        for (Integer i = 0; i < List.size() / 2; i++) {
            System.out.print("序号：" + (i + 1) + " 地点：" + "" + List.get(i + 1) + "  ");
            System.out.println("序号：" + (i + 6) + " 地点：" + "" + List.get(i + 6) + '\n');
        }
        while (true) {
            System.out.println("请输入对应序号添加行程，输入0结束输入");
            Integer choice = scanner.nextInt();
            if (choice == 0)
                break;
            aggregate.add(List.get(choice));
        }
        System.out.println("\n添加行程结束，以下是行程内容");
        Iterator it = aggregate.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            if (it.hasNext())
                System.out.print(ob.toString() + "->");
            else
                System.out.print(ob.toString() + "\n");
        }
        System.out.println("\n现在开始游览！");
        Object object=it.begin();
        while(it.hasNext()) {
            System.out.println("当前游览的地点为：" + object.toString());
            object = it.next();
            System.out.println("下一个地点是：" + object.toString() + "。请问你还想去吗？");
            System.out.println("按1继续行程，按2取消此行程");
            Integer a = scanner.nextInt();
            if (a == 1)
                ;
            else if (a == 2)
            {
                it.remove();
                System.out.println("行程已删除！");
                object=it.now();
            }
            else
            {
                System.out.println("操作错误！");
                object=it.prev();
            }
        }
        System.out.println("行程已结束！");
    }
}
