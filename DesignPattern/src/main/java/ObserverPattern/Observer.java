package ObserverPattern;


import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void  update(Car car);

    List<Subject> subjectList = new ArrayList<>();
}
