package L3.Challenge4;

public interface ObservedSubject {
    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObserver(String message);

}
