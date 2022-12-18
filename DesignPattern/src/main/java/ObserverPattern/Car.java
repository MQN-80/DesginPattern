package ObserverPattern;


import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Car implements Subject<Observer>{
    public class park
    {
        int state;
        public void setState(int state) {
            this.state = state;
        }
    }
    List<park> parkList=new ArrayList<>();
    public List getPark() {
        return parkList;
    }
    public void set() {
        for(int i=0;i<300;i++)
        {
            park park=new park();
            park.setState(0);
            parkList.add(park);
        }
    }
    public void setState(int state) {
        this.parkList.get(state).setState(abs(this.parkList.get(state).state-1));
        this.notifyAllObservers();
    }

    @Override
    public void notifyAllObservers() {
        for (Observer obs : list) {
            // 更新每一个观察者中的信息
            obs.update(this);
        }
    }

    @Override
    public void registerObserver(Observer obs) {
        // TODO Auto-generated method stub
        list.add(obs);
    }


    @Override
    public void removeObserver(Observer obs) {
        // TODO Auto-generated method stub
        list.remove(obs);
    }

}
