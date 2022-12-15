package BlackBoardPattern;

public class BulletinBoard
{
    public static void main(String[] args)
    {
        Blackboard blackboard = new Blackboard();
        Control control = new Control(blackboard);
        control.nextSource("各设施     开放时间");
        control.nextSource("售货机     全天开放");
        control.nextSource("纯K       6:00-24:00");
        control.nextSource("电影院     全天开放");
        control.nextSource("游戏厅     10:00-22:00");
        control.nextSource("电脑店     12:00~18:00");
        control.nextSource("今日五角场KCF餐厅限时折扣！欢迎前来品尝");
        control.loopNonPrint();
        blackboard.Print();
    }
}
