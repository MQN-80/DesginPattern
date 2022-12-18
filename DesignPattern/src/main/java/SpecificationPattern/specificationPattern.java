package SpecificationPattern;

import java.util.ArrayList;
import java.util.List;

public class specificationPattern {
    public static void main(String[] args){
        List<clothes> clothesList=new ArrayList<clothes>();
        clothesList.add(new clothes().addTag("男款").addTag("上衣").addTag("衬衫").addTag("L码"));
        clothesList.add(new clothes().addTag("女款").addTag("上衣").addTag("羽绒服").addTag("S码"));
        clothesList.add(new clothes().addTag("女款").addTag("饰品").addTag("手套").addTag("S码"));
        clothesList.add(new clothes().addTag("男款").addTag("鞋裤").addTag("毛裤").addTag("M码"));
        clothesList.add(new clothes().addTag("男款").addTag("鞋裤").addTag("皮鞋").addTag("XL码"));
        clothesList.add(new clothes().addTag("女款").addTag("上衣").addTag("睡衣").addTag("L码"));

        System.out.println("当前所有衣物");
        for (clothes c:clothesList) {
            c.print();
        }
        System.out.println();
        System.out.println("筛选所有“男款”衣物：");
        for (clothes c:clothesList) {
            if(new BizSpecification("男款").isSatisfiedBy(c))
                c.print();
        }
        System.out.println();
        System.out.println("筛选所有“女款”且“S码”衣物：");
        for (clothes c:clothesList) {
            if(new BizSpecification("女款").and(new BizSpecification("S码")).isSatisfiedBy(c))
                c.print();
        }
        System.out.println();
        System.out.println("筛选所有“上衣”或“饰品”衣物：");
        for (clothes c:clothesList) {
            if(new BizSpecification("上衣").or(new BizSpecification("饰品")).isSatisfiedBy(c))
                c.print();
        }
    }
}
