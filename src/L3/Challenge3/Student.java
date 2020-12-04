package L3.Challenge3;

public class Student {

    private String name;
    private int money;

    public Student(String name,int money)
    {
        this.money=money;
        this.name=name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
}
