package DecoratePattern;

public abstract class HamburgerDecotator extends IDecorator {
    private IDecorator basicHamburger;
    public HamburgerDecotator(IDecorator basicHamburger){
        this.basicHamburger=basicHamburger;
    }
    @Override
    public String makeHamburger(){
        return this.basicHamburger.makeHamburger();
    }
    @Override
    public int getPrice(){
        return this.basicHamburger.getPrice();
    }

}
