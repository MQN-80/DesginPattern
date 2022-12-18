package BridgePattern;

public class BridgeClient {
    public static void main(String[] args) {
        System.out.println("客人A想喝大杯正常糖的芋泥波波奶茶");
        KissTea teaA = new KissTea(new Large(),new Normal());
        System.out.println("客人A点的"+teaA.getType()+"，"+teaA.getSize()+"，"+teaA.getSweetness());

        System.out.println("客人B想喝小杯低糖的芋泥波波奶茶");
        KissTea teaB = new KissTea(new Small(),new Low());
        System.out.println("客人B点的"+teaB.getType()+"，"+teaB.getSize()+"，"+teaB.getSweetness());

        System.out.println("客人C想喝中杯低糖的奥利奥奶茶");
        OreoTea teaC = new OreoTea(new Middle(),new Low());
        System.out.println("客人C点的"+teaC.getType()+"，"+teaC.getSize()+"，"+teaC.getSweetness());
    }
}
