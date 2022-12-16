package CallbackPattern;

import java.util.Scanner;

public class Callback_Ticket implements Callback{
    public void call(){
        System.out.println("是否重新买票(Y/N)？");
        Scanner in = new Scanner(System.in);
        String T = in.nextLine();
        if(T.equals("Y"))
            System.out.println("买票成功");
        else {
            System.out.println("退出系统！");
        }
    }
}
