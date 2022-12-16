package TemplateMethodPattern;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎光临五角场金拱门, 请选择您要的汉堡");
        Scanner input = new Scanner(System.in);

        System.out.println("1——巨无霸，2——双层吉士汉堡，3——板烧鸡腿堡");
        int choice = input.nextInt();


        BigMac bigMac = new BigMac();
        DoubleCheese doubleCheese = new DoubleCheese();
        GCB gcb = new GCB();

        switch (choice) {
            case 1 -> {
                System.out.println(bigMac.getBurgerName() + ":");
                bigMac.makingBurger();
                System.out.println("请享用您的汉堡");
            }
            case 2 -> {
                System.out.println(doubleCheese.getBurgerName());
                doubleCheese.makingBurger();
                System.out.println("请享用您的汉堡");
            }
            case 3 -> {
                System.out.println(gcb.getBurgerName());
                gcb.makingBurger();
                System.out.println("请享用您的汉堡");
            }
            default -> System.out.println("没有您需要的汉堡");
        }
    }
}
