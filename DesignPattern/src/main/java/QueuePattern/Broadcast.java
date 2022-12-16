package QueuePattern;

import java.util.ArrayList;
import java.util.List;

public class Broadcast {
    Consumer consumer;
    Productor productor;
    public Broadcast(Consumer consumer,Productor productor){
        this.consumer=consumer;
        this.productor=productor;
    }
    public void get(){
        int length=productor.getMessage().size();
        for(int i=1;i<=length;i++){
            System.out.println("第"+i+"条加入队列的消息是:"+productor.getMessage().get(i-1).content);
        }
    }
    public void play(){
        int length=consumer.getMessage().size();
        for(int i=1;i<=length;i++){
            System.out.println("播报第"+i+"条消息："+consumer.getMessage().get(i-1).content);
        }
    }
}
