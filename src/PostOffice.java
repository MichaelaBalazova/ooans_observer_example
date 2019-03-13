import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PostOffice implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private Calendar timeArrived;

    public void newMailArrived() {
        timeArrived = Calendar.getInstance();
        notifyAllObservers();
        System.out.println("-------------------------------");
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void dettach(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update(timeArrived);
        }
    }
}