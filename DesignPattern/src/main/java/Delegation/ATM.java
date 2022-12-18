package Delegation;

public interface ATM {
    void save(Account account,int money);
    String withdraw(Account account,int money);
    int check(Account account);
}
