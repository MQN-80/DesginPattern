package VisitorPattern;

public class visitorTest {
    public static void main(String[] args) {
        Medicine a = new MedicineA("连花清瘟", 64.8);
        Medicine b = new MedicineB("999感冒灵", 12.8);

        Presciption presciption = new Presciption();
        presciption.addMedicine(a);
        presciption.addMedicine(b);

        Visitor charger = new Charger();
        charger.setName("成柯西");

        Visitor worker = new Worker();
        worker.setName("井亿");

        presciption.accept(charger);
        presciption.accept(worker);
    }
}
