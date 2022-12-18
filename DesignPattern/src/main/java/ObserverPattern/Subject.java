package ObserverPattern;

import java.util.ArrayList;
import java.util.List;


public interface Subject<T> {

        List<Observer> list = new ArrayList<>();

        public void registerObserver(T obs);

        public void removeObserver(T obs);

        public void notifyAllObservers();

}
