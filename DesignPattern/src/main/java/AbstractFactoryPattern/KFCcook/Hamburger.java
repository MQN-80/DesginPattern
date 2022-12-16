package AbstractFactoryPattern.KFCcook;

import AbstractFactoryPattern.Make;

public class Hamburger implements Make {

    @Override
    public void make() {
        System.out.println("制作一个汉堡！");
    }
}
