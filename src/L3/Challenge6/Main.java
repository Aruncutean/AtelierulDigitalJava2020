package L3.Challenge6;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person.PersonBuilder("Ion").setJob("Google engineer1").build();
        Person person2 = new Person.PersonBuilder("Pop").setJob("Google engineer2").setUniversity("UTCN").build();
        Person person3 = new Person.PersonBuilder("Ilie").setJob("Google engineer3").build();

        System.out.println(person1.getName());
        System.out.println(person2.getUniversity());
        System.out.println(person3.getJob());

    }
}
