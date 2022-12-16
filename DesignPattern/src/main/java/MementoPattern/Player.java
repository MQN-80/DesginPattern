package MementoPattern;

import java.util.Scanner;

public class Player {
    public static void main(String[] args) throws Exception {
        boolean judge=true;
        Scanner scanner=new Scanner(System.in);
        //存档管理者
        MementoManager mementoManager=new MementoManager();
        //存档组织者（面向用户）
        MementoOriginator mementoOriginator=new MementoOriginator();

        //游戏存档
        MementoFile mementoFile=new MementoFile(100,100,1,1);
        mementoOriginator.setMementoInfo(mementoFile.getMementoInfo());
        while(judge)
        {
            System.out.println("存档管理，您目前的存档情况为：");
            mementoManager.outPut();
            System.out.println("\n您目前的游戏状态为：");
            System.out.println("生命值为："+ mementoOriginator.getMementoInfo().getHP()+ "  魔力值为："+
                    mementoOriginator.getMementoInfo().getMP()+"  盔甲等级为："+
                    mementoOriginator.getMementoInfo().getArmorLevel()+"  武器等级为："+
                    mementoOriginator.getMementoInfo().getWeaponLevel());
            System.out.println("\n请选择操作：");
            System.out.println("1.进行游戏（编辑您的游戏状态）");
            System.out.println("2.保存游戏");
            System.out.println("3.读取游戏");
            System.out.println("4.死亡（模拟游戏结束，自动读取最新存档）");
            System.out.println("5.退出游戏\n");
            System.out.println("请选择操作");
            Integer choice=scanner.nextInt();
            MementoInfo mementoInfo= mementoOriginator.getMementoInfo();
            //获取当前执行的游戏数据
            switch (choice) {
                case 1:{
                    System.out.println("游戏进行到一定阶段，输入此时您的游戏状态：");
                    System.out.println("（按照生命值、魔法值、盔甲等级、武器等级排序）");
                    Integer HP=scanner.nextInt();
                    Integer MP=scanner.nextInt();
                    Integer ArmorLevel=scanner.nextInt();
                    Integer WeaponLevel=scanner.nextInt();
                    mementoInfo.setHP(HP);
                    mementoInfo.setMP(MP);
                    mementoInfo.setArmorLevel(ArmorLevel);
                    mementoInfo.setWeaponLevel(WeaponLevel);
                    System.out.println("游戏继续进行！\n");
                    break;
                }
                case 2:{
                    System.out.println("进行游戏保存");
                    mementoManager.addNewVersion(mementoOriginator.saveMementoFile());
                    System.out.println("游戏保存成功\n");
                    break;
                }
                case 3:{
                    System.out.println("读取游戏，请选择回退版本（1）还是前进版本（2）");
                    Integer version=scanner.nextInt();
                    if(version==1)
                    {
                        MementoFile mementoFile1=mementoManager.undo();
                        mementoOriginator.getMemento(mementoFile1);
                    }
                    else if(version==2)
                    {
                        MementoFile mementoFile1=mementoManager.redo();
                        mementoOriginator.getMemento(mementoFile1);
                    }
                    System.out.println("操作成功\n");
                    break;
                }
                case 4:{
                    System.out.println("假设您的角色死亡，自动读取最新存档\n");
                    mementoOriginator.getMemento(mementoManager.returnNewestVersion());
                    break;
                }
                case 5:{
                    judge=false;
                    break;
                }
            }
        }
    }
}
