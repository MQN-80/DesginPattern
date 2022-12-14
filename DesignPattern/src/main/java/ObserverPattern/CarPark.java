package ObserverPattern;

import java.util.List;

public class CarPark implements Observer{

    private int emptyNum;


    @Override
    public void update(Car car) {
        emptyNum=0;

        for(Car.park park : car.parkList)
        {
            if(park.state==0)
            {
                emptyNum++;
            }
        }
    }

    public int getEmptyNum() {
        return emptyNum;
    }
    public void setMyState(int emptyNum) {
        this.emptyNum = emptyNum;
    }

}
