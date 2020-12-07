package L4.Challenge1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    HashMap<String, Long> phoneNumbers = new HashMap<>();


    public PhoneBook(String phoneBook) {

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(phoneBook)));

            String name;
            Long number;
            while (scanner.hasNext()) {

                name = scanner.next();
                if (scanner.hasNextDouble()) {
                    number = scanner.nextLong();
                    phoneNumbers.put(name, number);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("not found");
        }


    }

    public long getByName(String name) {

        return phoneNumbers.get(name);
    }


    public String toString() {
        return phoneNumbers.toString();
    }


}
