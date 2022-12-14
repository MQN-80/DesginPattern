package DecoratePattern;

public class lettuceDecotator extends HamburgerDecotator {
    public lettuceDecotator(IDecorator basicHamburger,int number){
        super(basicHamburger);
        this.lettuceNumber=number;
    }
    private int lettuceNumber;  //加生菜数量
    public void setLettcue(int number){
        this.lettuceNumber=number;
    }
    @Override
    public String makeHamburger(){
        return super.makeHamburger()+"+"+ lettuceNumber +"片生菜";
    }
    @Override
    public int getPrice(){
        return super.getPrice()+this.lettuceNumber*3;
    }
}
