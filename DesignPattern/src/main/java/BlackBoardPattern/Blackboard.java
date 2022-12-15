package BlackBoardPattern;

import java.util.ArrayList;

public class Blackboard
{
    ArrayList<String> noticeList;

    public Blackboard()
    {
        noticeList = new ArrayList<>();
    }

    public void update(String newNotice)
    {
        noticeList.add(newNotice);
    }

    public void Print()
    {
        for (int i = 0; i < noticeList.size(); i++)
        {
            System.out.println("公告" + (i + 1) + noticeList.get(i));
        }
    }
}
