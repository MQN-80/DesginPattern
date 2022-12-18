package Delegation;

public class Test {
    public static void main(String[] args) {

        Account account=new Account();
        account.money=1000;
        Bank bank=new Bank();


        System.out.println("用户还有余额: "+bank.check(account));
        bank.save(account,50);
        System.out.println("用户存50元，余额为: "+bank.check(account));
        System.out.println("用户取500元，结果为: "+bank.withdraw(account,500));
        System.out.println("用户还有余额: "+bank.check(account));
        System.out.println("用户取800元，结果为: "+bank.withdraw(account,800));
        System.out.println("用户还有余额: "+bank.check(account));

    }
}
