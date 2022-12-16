package QueuePattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Message> abc=new ArrayList<>();
        Message one=new Message("五角场盛大开业！");
        Message two=new Message("欢迎大家前来！");
        Message three=new Message("优惠多多，不要错过！");
        abc.add(one);
        abc.add(two);
        abc.add(three);
        Broadcast broadcast=new Broadcast(new Consumer(abc),new Productor(abc));
        broadcast.get();
        System.out.println("===================================");
        broadcast.play();
    }
}
