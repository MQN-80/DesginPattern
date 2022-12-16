package AbstractFactoryPattern.KFCcook;

import AbstractFactoryPattern.Make;

public class Cola implements Make {

    @Override
    public void make() {
        System.out.println("制作一杯可乐！");
    }
}
