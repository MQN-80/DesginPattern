package ProtoPattern;

public class protoClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        for(int i=1;i<6;i++)
        {
            Toilet oldToilet=new Toilet(new wall("白色"),new mirror("干净"),new compartment(3),"30平米");
            Toilet newToilet=(Toilet) oldToilet.clone();
            System.out.println("五角场第"+i+"个洗手间面积为"+newToilet.getSize()+",镜子是"+newToilet.getWall()+"的，有" +
                    newToilet.getCompartment()+"个隔间，墙面是"+newToilet.getMirror()+"的。");
        }
    }
}
