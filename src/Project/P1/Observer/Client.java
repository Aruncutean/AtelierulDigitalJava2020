package Project.P1;

import L3.Challenge4.Teacher;

public class Client implements Observer {


    public void listenTo(Server server) {
       server.register(this);

    }

    @Override
    public void update(String message) {
        System.out.println("Message: " + message);
    }
}
