package AbstractFactoryPattern;

import AbstractFactoryPattern.KFCcook.Cola;
import AbstractFactoryPattern.KFCcook.Hamburger;

public class MakeFactory extends AbstarctFactory{
    @Override
    public Make getMake(String food) {
        if(food==null)
        {
            System.out.println("需要输入相应的食物参数！");
            return null;
        }

        if(food.equals("Cola"))
            return new Cola();
        else if (food.equals("Hamburger")) {
            return new Hamburger();
        }

        return null;
    }

    @Override
    public Give getGive(String food){
        return null;
    }
}
