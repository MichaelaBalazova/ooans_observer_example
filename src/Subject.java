public interface Subject {

    void attach(Observer observer);

    void dettach(Observer observer);

    void notifyAllObservers();
}
