package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<IObserver> observers = new ArrayList<IObserver>();
    public void attach(IObserver observer){
        observers.add(observer);
    }
    public void detach(IObserver observer){
        observers.remove(observer);
    }
    public void notifyd(){
        for (IObserver observer:observers) {
            observer.update();
        }
    }


}
