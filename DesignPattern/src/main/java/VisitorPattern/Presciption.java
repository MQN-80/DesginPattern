package VisitorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Presciption {
    List<Medicine> list = new ArrayList<Medicine>();

    public void accept(Visitor visitor){
        Iterator<Medicine> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void addMedicine(Medicine medicine){
        list.add(medicine);
    }

    public void removeMedicine(Medicine medicine){
        list.remove(medicine);
    }
}
