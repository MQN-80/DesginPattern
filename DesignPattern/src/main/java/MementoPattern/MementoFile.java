package MementoPattern;

import java.util.Date;

public class MementoFile//备忘录类
{
    MementoInfo mementoInfo;
    public MementoFile(Integer Hp,Integer Mp,Integer armorLevel,Integer weaponLevel)//初始化时不定义版本号，在添加到列表时才定义
    {
        mementoInfo=new MementoInfo();
        mementoInfo.setHP(Hp);
        mementoInfo.setMP(Mp);
        mementoInfo.setArmorLevel(armorLevel);
        mementoInfo.setWeaponLevel(weaponLevel);
        mementoInfo.setDateTime(new Date().getTime());
    }

    public MementoInfo getMementoInfo(){
        return mementoInfo;
    }

    public void setVersionNo(Integer versionNo){
        mementoInfo.setVersionNo(versionNo);
    }

    public void setMementoInfo(MementoInfo mementoInfo){
        this.mementoInfo=mementoInfo;
    }

}
