package MementoPattern;

public class MementoInfo
{
    private Integer versionNo;//备忘录编号
    private String content;//内容
    private long dateTime;//编写时间

    public Integer getVersionNo(){
        return versionNo;
    }

    public String getContent(){
        return content;
    }

    public long getDateTime(){
        return dateTime;
    }

    public void setVersionNo(Integer versionNo){
        this.versionNo=versionNo;
    }

    public void setContent(String content){
        this.content=content;
    }

    public void setDateTime(long dateTime){
        this.dateTime=dateTime;
    }
}
