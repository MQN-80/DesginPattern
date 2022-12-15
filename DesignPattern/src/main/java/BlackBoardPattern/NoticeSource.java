package BlackBoardPattern;

public class NoticeSource
{
    Blackboard blackboard;
    String notice;

    public NoticeSource(Blackboard blackboard, String notice)
    {
        this.blackboard = blackboard;
        this.notice = notice;
    }

    public void updateBlackboard()
    {
        blackboard.update(notice);
    }
}
