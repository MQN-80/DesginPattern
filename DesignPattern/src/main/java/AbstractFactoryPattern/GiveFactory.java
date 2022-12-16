package AbstractFactoryPattern;

import AbstractFactoryPattern.KFCgive.sendCola;
import AbstractFactoryPattern.KFCgive.sendHamburger;

public class GiveFactory extends AbstarctFactory {
    @Override
    public Give getGive(String food) {
        if(food==null)
        {
            System.out.println("需要输入相应的食物参数！");
            return null;
        }

        if(food.equals("Cola"))
            return new sendCola();
        else if (food.equals("Hamburger")) {
            return new sendHamburger();
        }

        return null;
    }

    @Override
    public Make getMake(String food) {
        return null;
    }
}
