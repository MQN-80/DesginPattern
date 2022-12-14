package MementoPattern;

public class MementoInfo//存档数据
{
    private Integer versionNo;//备忘录编号

    private Integer HP;//生命值

    private Integer MP;//魔力值

    private Integer ArmorLevel;//盔甲等级

    private Integer WeaponLevel;//武器等级
    public Integer getHP() {
        return HP;
    }

    public Integer getArmorLevel() {
        return ArmorLevel;
    }

    public Integer getMP() {
        return MP;
    }

    public Integer getWeaponLevel() {
        return WeaponLevel;
    }

    public void setArmorLevel(Integer armorLevel) {
        ArmorLevel = armorLevel;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public void setMP(Integer MP) {
        this.MP = MP;
    }

    public void setWeaponLevel(Integer weaponLevel) {
        WeaponLevel = weaponLevel;
    }
    private long dateTime;//编写时间

    public Integer getVersionNo(){
        return versionNo;
    }

    public long getDateTime(){
        return dateTime;
    }

    public void setVersionNo(Integer versionNo){
        this.versionNo=versionNo;
    }

    public void setDateTime(long dateTime){
        this.dateTime=dateTime;
    }
}
