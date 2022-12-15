package Delegation;

public class Bank implements ATM{
    @Override
    public void save(Account account,int money) {
        account.saveMoney(money);

    }

    @Override
    public int check(Account account) {
        return account.getMoney();

    }

    @Override
    public String withdraw(Account account,int money) {
        return account.withdrawMoney(money);
    }
}
