package NullObjectPattern;

public class RealStaff extends AbstractStaff{
    public RealStaff(String name,String occupation,String age) {
        this.name = name;
        this.occupation=occupation;
        this.age=age;
    }

    @Override
    public void print() {
        System.out.println(name+" "+occupation+" "+age);
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
