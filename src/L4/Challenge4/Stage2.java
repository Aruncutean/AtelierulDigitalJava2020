package L4.Challenge4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stage2 {
    private BufferedWriter bufferedWriter;
    private Scanner bufferedReader;
    private String[] lines;

    public Stage2(String nameI, String nameO) {
        try {
            bufferedReader = new Scanner(new BufferedReader(new FileReader(nameI)));
            bufferedWriter = new BufferedWriter(new FileWriter(nameO));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(int width, int height) {
        lines = new String[height + 1];
        for (int i = 0; i < height; i++) {

            lines[i]=new String();
        }
        try {
            while (bufferedReader.hasNext()) {
                int nr = bufferedReader.nextInt();


                switch (nr) {
                    case 1:
                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width+1; j++) {
                                if(i==0)
                                {
                                    lines[i]+=" ";
                                }
                                else if(j==width){
                                    lines[i]+="|";
                                }else {
                                    lines[i]+=" ";
                                }
                            }
                        }

                        break;
                    case 2:
                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width+1; j++) {
                                if(i==0 && j==0 ||j==width)
                                {
                                    lines[i]+=" ";
                                }
                                else if(i==0)
                                {
                                    lines[i]+="_";
                                }
                                else if(j==width){
                                    lines[i]+="|";
                                }else {
                                    lines[i]+=" ";
                                }
                            }
                        }

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    case 9:

                    default:
                        break;
                }
            }

            for (int i = 0; i < height; i++) {
                bufferedWriter.write(lines[i]+"\n");
            }
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
