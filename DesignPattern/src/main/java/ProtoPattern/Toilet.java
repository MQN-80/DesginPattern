package ProtoPattern;

public class Toilet implements Cloneable {
    @Override //重写clone()方法
    // 提升访问权限为public
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    wall Wall;
    mirror Mirror;
    compartment Compartment;
    String size;

    public String getWall() {
        return Wall.getColor();
    }

    public String getMirror() {
        return Mirror.getClean();
    }

    public int getCompartment() {
        return Compartment.getNum();
    }

    public String getSize() {
        return size;
    }

    public Toilet(wall Wall, mirror Mirror, compartment Compartment, String size){
        this.Compartment=Compartment;
        this.Mirror=Mirror;
        this.Wall=Wall;
        this.size =size;
    }
}
