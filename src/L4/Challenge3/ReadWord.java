package L4.Challenge3;

import L3.Challenge3.RealEstateAgentProxy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadWord {

    private String word;
    private Scanner scanner;

    public ReadWord(String fileName) {
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
        } catch (FileNotFoundException e) {
            System.out.println("The file cannot be opened or does not exist");
        }
    }

    public String nextWord() throws FileEnd {
        if (word == null) {
            word = new String();
        }

        if(scanner.hasNext())
        {
            word=scanner.next();
        }else {
            scanner.close();
            throw new FileEnd();
        }


        return word;
    }


}
