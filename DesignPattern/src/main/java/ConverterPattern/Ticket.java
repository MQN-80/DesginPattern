package ConverterPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket
{
    private String name;
    private String ID;
    private int age;
    private Date date = new Date();

    public Ticket(){}

    public Ticket(String name, String ID, int age)
    {
        this.name = name;
        this.ID = ID;
        this.age = age;
        date = new Date();
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public void printInfomation()
    {
        String ticketInfo = """
                                
                ------------------------
                门票信息：
                游客姓名：%s
                身份证号：%s
                游客年龄：%d
                购票时间：%s
                ------------------------
                """;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        ticketInfo = String.format(ticketInfo, name, ID, age, dateFormat.format(date));
        System.out.println(ticketInfo);
    }


}