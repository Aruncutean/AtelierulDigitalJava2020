package L4.Challenge3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ReadWord readWord = new ReadWord("./src/L4/Challenge3/wordlist.txt");
        WriteFile writeFile = new WriteFile("./src/L4/Challenge3/OutputWordlist.txt");
        while (true) {
            try {
                String word = readWord.nextWord();
                Bkt bkt = new Bkt(word);
                List<String> strings = bkt.getWords();

                writeFile.Write(strings);
            } catch (FileEnd fileEnd) {
                break;
            }
        }
        writeFile.fileClose();


    }
}
