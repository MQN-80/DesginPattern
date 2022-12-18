package AbstractFactoryPattern.KFCgive;

import AbstractFactoryPattern.Give;

public class sendCola implements Give {
    @Override
    public void give() {
        System.out.println("送餐可乐");
    }
}
