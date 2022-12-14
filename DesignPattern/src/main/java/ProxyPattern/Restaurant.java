package ProxyPattern;

public class Restaurant implements FoodDeliverd {
    private String name; //餐厅名称
    public Restaurant(String name){
        this.name=name;
    }
    public void makeFood(String food){
        System.out.println("正在制作"+food+"中");
        try {
            //假设制作需要2s
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("制作完成");
    }
    public void sendFood(String food){
        System.out.println("正在配送"+food+"中");
        try {
            //假设制作需要2s
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("配送完成");
    }
}
