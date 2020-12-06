package L3.Challenge4;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observer {

    private String name;


    public Student(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + this.name + " learned about " + message);
    }

}
