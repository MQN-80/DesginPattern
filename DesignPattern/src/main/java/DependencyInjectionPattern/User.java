package DependencyInjectionPattern;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.addProduct(new Product("汽水",3,20));
        vendingMachine.addProduct(new Product("牛奶",5,20));
        vendingMachine.addProduct(new Product("矿泉水",2,20));
        boolean judge=true;
        while(judge)
        {
            System.out.println("小卖部开门了啊\n");
            vendingMachine.outPut();
            System.out.println("\n请选择操作：");
            System.out.println("1.添加商品（员工操作）");
            System.out.println("2.商品补货（员工操作）");
            System.out.println("3.下架商品（员工操作）");
            System.out.println("4.购买商品");
            System.out.println("5.退出售货机\n");
            Integer a=scanner.nextInt();
            switch (a)
            {
                case 1:{
                    System.out.println("请输入要添加的商品的名字、价格、数量");
                    String name=scanner.next();
                    Integer price=scanner.nextInt();
                    Integer num=scanner.nextInt();
                    vendingMachine.addProduct(new Product(name,price,num));
                    System.out.println("添加成功，返回主界面\n");
                    break;
                }
                case 2:{
                    System.out.println("请输入要补货的商品的名字、数量");
                    String name=scanner.next();
                    Integer num=scanner.nextInt();
                    Product product=vendingMachine.selectProduct(name);
                    if(product==null) {
                        System.out.println("商品未找到，返回主界面\n");
                    }
                    else {
                        System.out.println("商品已找到\n商品名称："+product.getName()+"  价格："+
                                product.getPrice()+"   剩余数量："+product.getNum()
                        +"\n经过补货后，回到主界面\n");
                        product.setNum(product.getNum()+num);
                    }
                    break;
                }
                case 3:{
                    System.out.println("请输入要下架的商品的名字");
                    String name=scanner.next();
                    Product product=vendingMachine.selectProduct(name);
                    if(product==null) {
                        System.out.println("商品未找到，返回主界面\n");
                    }
                    else {
                        System.out.println("商品已找到\n商品名称："+product.getName()+"  价格："+
                                product.getPrice()+"   剩余数量："+product.getNum()
                                +"\n经过下架后，回到主界面\n");
                        vendingMachine.removeProduct();
                    }
                    break;
                }
                case 4:{
                    System.out.println("请输入要购买的商品的名字");
                    String name=scanner.next();
                    Product product=vendingMachine.selectProduct(name);
                    if(product==null) {
                        System.out.println("商品未找到，返回主界面\n");
                    }
                    else {
                        System.out.println("商品已找到\n商品名称："+product.getName()+"  价格："+
                                product.getPrice()+"   剩余数量："+product.getNum());
                        System.out.println("请输入你要购买的数量");
                        Integer num=scanner.nextInt();
                        if(num<=product.getNum()) {
                            System.out.println("购买成功，回到主界面\n");
                            product.setNum(product.getNum() - num);
                        }
                        else
                            System.out.println("库存不够！回到主界面\n");
                    }
                    break;
                }
                case 5:{
                    break;
                }
                default:{
                    judge=false;
                    System.out.println("操作失败！回到主界面\n");
                    break;
                }
            }
        }
    }
}
