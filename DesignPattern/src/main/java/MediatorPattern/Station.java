package MediatorPattern;

public class Station {
    private String name;          //站点名称
    private Integer bikeNumber;   //单车数量

    private StationMediator bikeMediator;
    public Station(String name,Integer number){
        this.name=name;
        this.bikeNumber=number;
    }
    public String getName(){
        return this.name;
    }
    public void setBikeMediator(StationMediator bikeMediator){
        this.bikeMediator=bikeMediator;
        bikeMediator.addStation(this);
    }
    public void sendMessage(String message){
        bikeMediator.sendMessage(this,message);
    }
    public void readMessage(Station station,String message){
        System.out.println(this.name+"接收到"+station.getName()+"的消息,消息为:"+message);
    }
}
