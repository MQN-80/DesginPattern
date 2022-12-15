package MediatorPattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StationMediator implements Mediator{
    private static List<Station> StationList;
    public StationMediator(){
        StationList=new ArrayList<>();
    }
    public void addStation(Station station){
        StationList.add(station);
        System.out.println(station.getName()+"已加入");
    }
    public void sendMessage(Station station,String message){
        for(Station midStation:StationList){
            if(!station.equals(midStation)){
                midStation.readMessage(station,message);
            }
        }
    }
}
