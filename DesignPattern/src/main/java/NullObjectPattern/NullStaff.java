package NullObjectPattern;

public class NullStaff extends AbstractStaff{
    @Override
    public void print() {
        System.out.println("不存在该人员信息");
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
