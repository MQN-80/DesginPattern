package NullObjectPattern;

public class StaffFactory {
    public static final String[][] names = {{"张三","服务员","31岁"}, {"李四","收银员","37岁"}, {"王五","保安","44岁"}};

    public static AbstractStaff getStaff(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i][0].equalsIgnoreCase(name)){
                return new RealStaff(names[i][0],names[i][1],names[i][2]);
            }
        }
        return new NullStaff();
    }
}
