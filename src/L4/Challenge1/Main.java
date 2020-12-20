package L4.Challenge1;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/L4/L5.Challenge1/input.txt");
        System.out.println(phoneBook.toString());
        System.out.println("Abbey: " + phoneBook.getByName("Abbey"));
        System.out.println("Abdul: " + phoneBook.getByName("Abdul"));
    }
}
