package DecoratePattern;

public class MeatDecorator extends HamburgerDecotator{
    public MeatDecorator(IDecorator basicHamburger,int number){
        super(basicHamburger);
        this.meatNumber=number;
    }
    private int meatNumber;  //加肉饼数量
    public void setMeat(int number){
        this.meatNumber=number;
    }
    @Override
    public String makeHamburger(){
        return super.makeHamburger()+"+"+ meatNumber +"个肉饼";
    }
    @Override
    public int getPrice(){
        return super.getPrice()+this.meatNumber*3;
    }
}
