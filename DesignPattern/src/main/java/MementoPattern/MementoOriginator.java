package MementoPattern;

public class MementoOriginator //组织者类
{
    private MementoInfo mementoInfo;

    public MementoInfo getMementoInfo()//查看当前备忘录
    {
        return mementoInfo;
    }

    public void setMementoInfo(MementoInfo mementoInfo)//编写当前备忘录
    {
        this.mementoInfo=mementoInfo;
    }

    public MementoFile saveMementoFile()//保存备忘录
    {
        return new MementoFile(mementoInfo.getHP(),mementoInfo.getMP(),
                mementoInfo.getArmorLevel(),mementoInfo.getWeaponLevel());
    }

    public void getMemento(MementoFile mementoFile)//获取备忘录内容
    {
        this.mementoInfo=new MementoInfo();
        mementoInfo.setHP(mementoFile.getMementoInfo().getHP());
        mementoInfo.setMP(mementoFile.getMementoInfo().getMP());
        mementoInfo.setArmorLevel(mementoFile.getMementoInfo().getArmorLevel());
        mementoInfo.setWeaponLevel(mementoFile.getMementoInfo().getWeaponLevel());
    }
}
