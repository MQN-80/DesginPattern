package Delegation;

public class Account {
    int money;

    public int getMoney() {
        return money;
    }

    public void saveMoney(int money) {
        this.money = money+this.money;
    }
    public String withdrawMoney(int money) {
        if(this.money>=money)
        {
            this.money = this.money-money;
            return "取钱成功";
        }
        return "取钱失败，余额不足";

    }
}
