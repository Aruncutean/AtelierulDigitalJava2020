package L4.Challenge2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      MessageSecret messageSecret=new MessageSecret("./src/L4/Challenge2/message.txt");
        System.out.println(messageSecret.getMessage());

    }
}
