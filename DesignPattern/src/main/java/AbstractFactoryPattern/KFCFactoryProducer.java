package AbstractFactoryPattern;

public class KFCFactoryProducer{

    public AbstarctFactory getFactory(String Type){

        if(Type.equals("Make"))
            return new MakeFactory();
        else if (Type.equals("Give")) {
            return new GiveFactory();
        }
        return null;
    }
}
