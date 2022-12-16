package ConverterPattern;

public class Visitor
{

    private String name;
    private String ID;
    private int age;
    private int height;

    public Visitor() {}

    public Visitor(String name, String ID, int age, int height)
    {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.height = height;
    }

    public Visitor(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Visitor setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getID()
    {
        return ID;
    }

    public Visitor setID(String ID)
    {
        this.ID = ID;
        return this;
    }

    public int getAge()
    {
        return age;
    }

    public Visitor setAge(int age)
    {
        this.age = age;
        return this;
    }

    public int getHeight(){return this.height;}

    public Visitor setHeight(int height){
        this.height = height;
        return this;
    }


    public void printInfomation()
    {
        String visitorInfo = """
                                
                ------------------------
                游客信息：
                游客姓名：%s
                身份证号：%s
                游客年龄：%d
                游客身高：%d
                ------------------------
                """;
        visitorInfo = String.format(visitorInfo, name, ID, age, height);
        System.out.println(visitorInfo);
    }

}