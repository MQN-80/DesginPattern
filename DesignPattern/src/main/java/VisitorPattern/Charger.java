package VisitorPattern;

public class Charger extends Visitor{
    @Override
    public void visitor(MedicineA a) {
        System.out.println("定价员：" + name +"给药" + a.getName() +"划价:" + a.getPrice());
    }
    @Override
    public void visitor(MedicineB b) {
        System.out.println("定价员：" + name +"给药" + b.getName() +"划价:" + b.getPrice());
    }
}
