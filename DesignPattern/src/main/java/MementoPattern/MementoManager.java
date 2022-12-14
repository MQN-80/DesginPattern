package MementoPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MementoManager //管理者类
{

    private Integer totalVersion=0;//总版本
    private Integer versionNo=0;//目前指针
    private List<MementoFile> mementoFileList=new ArrayList<>();//备忘录列表

    public void outPut(){
        Iterator<MementoFile> iterator=mementoFileList.iterator();
        while(iterator.hasNext()){
            MementoFile mementoFile=iterator.next();
            System.out.println("版本号为："+mementoFile.getMementoInfo().getVersionNo()+"    保存时间为："+
                    mementoFile.getMementoInfo().getDateTime()+"    生命值为："+
                    mementoFile.getMementoInfo().getHP()+"  魔力值为："+
                    mementoFile.getMementoInfo().getMP()+"\n             盔甲等级为："+
                    mementoFile.getMementoInfo().getArmorLevel()+"  武器等级为："+
                    mementoFile.getMementoInfo().getWeaponLevel());
        }
    }

    //新增备忘录版本
    public void addNewVersion(MementoFile mementoFile){
        versionNo++;
        totalVersion++;
        versionNo=totalVersion;
        mementoFile.setVersionNo(totalVersion);
        mementoFileList.add(mementoFile);
    }

    public MementoFile returnNewestVersion()
    {
        return mementoFileList.get(mementoFileList.size()-1);
    }
    //回滚历史配置
    public MementoFile undo(){
        versionNo--;
        if(versionNo==0) //往前仅有一个版本
        {
            versionNo=1;
            return mementoFileList.get(0);
        }
        else if(versionNo<0)//未保存版本，返回Null
        {
            versionNo=0;
            return null;
        }
        return mementoFileList.get(versionNo-1);
    }

    //前进历史配置
    public MementoFile redo(){
        versionNo++;
        if(versionNo>mementoFileList.size()) //往后无新版本
        {
            versionNo--;
            return mementoFileList.get(mementoFileList.size() - 1);
        }
        return mementoFileList.get(versionNo-1);
    }
}
