package L3.Challenge4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {

    private List<Student> studentList;

    public void teach(String message) {
        notifyObserver(message);
    }


    @Override
    public void register(Observer obj) {
        if (studentList == null) {
            studentList = new ArrayList<>();
        }
        studentList.add((Student) obj);

    }

    @Override
    public void unregister(Observer obj) {
        studentList.remove(obj);
    }


    @Override
    public void notifyObserver(String message) {
        for (Student student : studentList) {
            student.update(message);
        }
    }
}
