package VisitorPattern;

public class Worker extends Visitor{
    @Override
    public void visitor(MedicineA a) {
        System.out.println("药店工作人员：" + name + "拿药 ：" + a.getName());
    }
    @Override
    public void visitor(MedicineB b) {
        System.out.println("药店工作人员：" + name + "拿药 ：" + b.getName());
    }
}
