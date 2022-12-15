package CompositePattern;

public class SuNing {
    public static void main(String[] args) {
        Company suNing = new Company("Su Ning");
        Department market = new Department("market");
        Department develop = new Department("develop");

        // Employee in market
        Employee steve = new Employee("steve");
        Employee doro = new Employee("doro");
        // Employee in dev
        Employee jason = new Employee("jason");
        Employee tom = new Employee("tom");

        market.add(steve);
        market.add(doro);
        develop.add(jason);
        develop.add(tom);

        suNing.add(market);
        suNing.add(develop);

        suNing.displayStructure("");

        develop.remove(jason);

        suNing.displayStructure("");
    }
}
