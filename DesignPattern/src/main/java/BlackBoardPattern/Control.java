package BlackBoardPattern;

import java.util.ArrayList;
public class Control
{
    ArrayList<NoticeSource> noticeSources;//消息源
    Blackboard blackboard;

    public Control(Blackboard blackboard)
    {
        noticeSources = new ArrayList<>();
        this.blackboard = blackboard;
    }

    public void loopNonPrint()
    {
        for (NoticeSource noticeSource : noticeSources)
        {
            noticeSource.updateBlackboard();
        }
        this.noticeSources = new ArrayList<>();
    }

    public void nextSource(String notice)
    {
        NoticeSource tempSource = new NoticeSource(blackboard, notice);
        noticeSources.add(tempSource);
    }

}
