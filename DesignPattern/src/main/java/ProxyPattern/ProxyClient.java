package ProxyPattern;

public class ProxyClient {
    public static void main(String[] args) {
        Restaurant starBuck=new Restaurant("starBuck");
        MeiTuan proxy=new MeiTuan(starBuck);
        proxy.sendFood("抹茶星冰乐");
        proxy.sendFood("焦糖玛奇朵");
    }
}
