package L4.Challenge3;

import java.io.*;
import java.util.List;

public class WriteFile {
    private BufferedWriter bufferedWriter;

    public WriteFile(String nameFile) {

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(nameFile));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Write(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            try {
                bufferedWriter.write(words.get(i) + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
    public void fileClose()
    {
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
