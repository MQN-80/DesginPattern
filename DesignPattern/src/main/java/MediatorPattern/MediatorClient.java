package MediatorPattern;



public class MediatorClient {
    public static void main(String[] args) {
        StationMediator stationMediator=new StationMediator();
        StationA stationA=new StationA("万达入口",150);
        StationB stationB=new StationB("KTV入口",100);
        StationC stationC=new StationC("商城入口",90);
        stationA.setBikeMediator(stationMediator);
        stationB.setBikeMediator(stationMediator);
        stationC.setBikeMediator(stationMediator);
        stationA.sendMessage("缺少车辆");
    }

}
