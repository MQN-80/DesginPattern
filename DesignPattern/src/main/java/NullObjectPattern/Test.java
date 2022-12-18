package NullObjectPattern;

public class Test {
    public static void main(String[] args){
        AbstractStaff staff1 = StaffFactory.getStaff("张三");
        AbstractStaff staff2 = StaffFactory.getStaff("赵六");
        AbstractStaff staff3 = StaffFactory.getStaff("李四");

        System.out.println("查询工作人员信息（张三，赵六，李四）");
        staff1.print();
        staff2.print();
        staff3.print();
    }
}
