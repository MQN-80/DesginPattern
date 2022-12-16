package AbstractFactoryPattern.KFCgive;

import AbstractFactoryPattern.Give;

public class sendHamburger implements Give {
    @Override
    public void give() {
        System.out.println("送餐汉堡");
    }
}
