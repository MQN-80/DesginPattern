package ObserverPattern;

public class Test {
    public static void main(String[] args) {

        Car subject = new Car();
        CarPark  obs1 = new CarPark();
        CarPark  obs2 = new CarPark();

        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.set();
        subject.setState(33);
        System.out.println("提示板1显示现有车位:"+obs1.getEmptyNum());
        System.out.println("提示板2显示现有车位:"+obs2.getEmptyNum());

        subject.setState(30);
        System.out.println("提示板1显示现有车位:"+obs1.getEmptyNum());
        System.out.println("提示板2显示现有车位:"+obs2.getEmptyNum());


        for(int i=0;i<60;i++)
        {
            subject.setState(i);
        }
        System.out.println("提示板1显示现有车位:"+obs1.getEmptyNum());
        System.out.println("提示板2显示现有车位:"+obs2.getEmptyNum());

    }
}
