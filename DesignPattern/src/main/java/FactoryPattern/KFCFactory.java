package FactoryPattern;

import FactoryPattern.Food.Cola;
import FactoryPattern.Food.FrenchFries;
import FactoryPattern.Food.Hamburger;

public class KFCFactory {
    public Make getMake(String Type){
        if(Type==null)
        {
            System.out.println("需要输入相应的食物参数！");
            return null;
        }

        if(Type.equals("Cola"))
            return new Cola();
        else if (Type.equals("FrenchFries")) {
            return new FrenchFries();
        } else if (Type.equals("Hamburger")) {
            return new Hamburger();
        }
        else
            return null;
    }
}
