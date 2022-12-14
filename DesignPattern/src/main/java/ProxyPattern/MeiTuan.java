package ProxyPattern;

public class MeiTuan implements FoodDeliverd{
    private Restaurant restaurant;
    public MeiTuan(FoodDeliverd foodDeliverd){
        //只代理饭店类
        if(foodDeliverd.getClass()==Restaurant.class){
            this.restaurant=(Restaurant)foodDeliverd;
        }
        System.out.println("美团上线运行");
    }
    public void sendFood(String food){
        restaurant.makeFood(food);
        restaurant.sendFood(food);
    }
}
