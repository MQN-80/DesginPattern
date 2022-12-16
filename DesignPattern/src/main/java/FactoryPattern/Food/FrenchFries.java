package FactoryPattern.Food;

import FactoryPattern.Make;

public class FrenchFries implements Make {

    @Override
    public void make() {
        System.out.println("制作一包薯条！");
    }
}
