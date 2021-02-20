package Project.P1;

public interface Observed {
    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObserver(String message);

}
