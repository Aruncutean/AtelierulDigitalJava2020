package L3.Challenge4;

public class Student implements  ObservedSubject{

    private String name;

    public Student(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void register(Observer obj) {

    }

    @Override
    public void unregister(Observer obj) {

    }

    @Override
    public void notifyObserver(String message) {

    }
}
