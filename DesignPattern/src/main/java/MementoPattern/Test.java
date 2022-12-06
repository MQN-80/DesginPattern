package MementoPattern;

import java.util.Date;
import java.util.concurrent.DelayQueue;

public class Test {
    public static void main(String[] args) throws Exception {
        MementoManager mementoManager=new MementoManager();

        //新增四个版本
        MementoOriginator mementoOriginator=new MementoOriginator();
        MementoInfo mementoInfo=new MementoInfo();
        mementoInfo.setContent("内容1");
        mementoOriginator.setMementoInfo(mementoInfo);
        mementoManager.addNewVersion(mementoOriginator.saveMementoFile());
        Thread.sleep(100);
        mementoInfo.setContent("内容2");
        mementoOriginator.setMementoInfo(mementoInfo);
        mementoManager.addNewVersion(mementoOriginator.saveMementoFile());
        Thread.sleep(100);
        mementoInfo.setContent("内容3");
        mementoOriginator.setMementoInfo(mementoInfo);
        mementoManager.addNewVersion(mementoOriginator.saveMementoFile());
        Thread.sleep(100);
        mementoInfo.setContent("内容4");
        mementoOriginator.setMementoInfo(mementoInfo);
        mementoManager.addNewVersion(mementoOriginator.saveMementoFile());


        //连续回退两个版本
        mementoOriginator.getMemento(mementoManager.undo());
        System.out.println("回退到第"+mementoOriginator.getMementoInfo().getVersionNo()+"版本，内容为："
                +mementoOriginator.getMementoInfo().getContent()+" ，时间为："
                +mementoOriginator.getMementoInfo().getDateTime());
        Thread.sleep(1000);
        mementoOriginator.getMemento(mementoManager.undo());
        System.out.println("回退到第"+mementoOriginator.getMementoInfo().getVersionNo()+"版本，内容为："
                +mementoOriginator.getMementoInfo().getContent()+" ，时间为："
                +mementoOriginator.getMementoInfo().getDateTime());
        Thread.sleep(1000);
        //前进一个版本
        mementoOriginator.getMemento(mementoManager.redo());
        System.out.println("前进到第"+mementoOriginator.getMementoInfo().getVersionNo()+"版本，内容为："
                +mementoOriginator.getMementoInfo().getContent()+" ，时间为："
                +mementoOriginator.getMementoInfo().getDateTime());
        Thread.sleep(1000);
        //跳转到第二个版本
        mementoOriginator.getMemento(mementoManager.get(2));
        System.out.println("跳转到第"+mementoOriginator.getMementoInfo().getVersionNo()+"版本，内容为："
                +mementoOriginator.getMementoInfo().getContent()+" ，时间为："
                +mementoOriginator.getMementoInfo().getDateTime());

        //此时新增第五个版本，3、4版本被覆盖
        mementoInfo.setContent("内容5");
        mementoOriginator.setMementoInfo(mementoInfo);
        mementoManager.deleteLaterVersion();
        mementoManager.addNewVersion(mementoOriginator.saveMementoFile());

        //连续回退两个版本，最终会回退到2版本
        mementoOriginator.getMemento(mementoManager.undo());
        System.out.println("回退到第"+mementoOriginator.getMementoInfo().getVersionNo()+"版本，内容为："
                +mementoOriginator.getMementoInfo().getContent()+" ，时间为："
                +mementoOriginator.getMementoInfo().getDateTime());
        Thread.sleep(1000);
        mementoOriginator.getMemento(mementoManager.undo());
        System.out.println("回退到第"+mementoOriginator.getMementoInfo().getVersionNo()+"版本，内容为："
                +mementoOriginator.getMementoInfo().getContent()+" ，时间为："
                +mementoOriginator.getMementoInfo().getDateTime());
        Thread.sleep(1000);
    }
}
