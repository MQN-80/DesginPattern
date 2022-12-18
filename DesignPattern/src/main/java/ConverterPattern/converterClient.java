package ConverterPattern;

public class converterClient {
    public static void main(String[] args) {
        Visitor vi =new Visitor();

        vi.setAge(24);
        vi.setID("11451419198080");
        vi.setHeight(180);
        vi.setName("陈刀仔");

        System.out.println("展示游客信息!");
        vi.printInfomation();

        VisitorConverter vtConverter= new VisitorConverter();

        Ticket ti=vtConverter.entity2dto(vi);
        ti.printInfomation();
    }
}
