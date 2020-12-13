package L4.Challenge4;

import javax.management.MBeanRegistration;
import java.io.*;
import java.util.Scanner;

public class Stage1 {

    private BufferedWriter bufferedWriter;
    private Scanner bufferedReader;

    public Stage1(String nameI, String nameO) {
        try {
            bufferedReader = new Scanner(new BufferedReader(new FileReader(nameI)));
            bufferedWriter = new BufferedWriter(new FileWriter(nameO));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        String line1 = new String();
        String line2 = new String();
        String line3 = new String();
        try {
            while (bufferedReader.hasNext()) {
                int nr = bufferedReader.nextInt();


                switch (nr) {
                    case 1:
                        line1 += "    ";
                        line2 += "  | ";
                        line3 += "  | ";
                        break;
                    case 2:

                        line1 += " _  ";
                        line2 += " _| ";
                        line3 += "|_  ";
                        break;
                    case 3:

                        line1 += " _  ";
                        line2 += " _| ";
                        line3 += " _| ";
                        break;
                    case 4:
                        line1 += "    ";
                        line2 += "|_| ";
                        line3 += "  | ";
                        break;
                    case 5:
                        line1 += " _  ";
                        line2 += "|_  ";
                        line3 += " _| ";
                        break;
                    case 6:
                        line1 += " _  ";
                        line2 += "|_  ";
                        line3 += "|_| ";
                        break;
                    case 7:
                        line1 += " _  ";
                        line2 += "  | ";
                        line3 += "  | ";
                        break;
                    case 8:
                        line1 += " _  ";
                        line2 += "|_| ";
                        line3 += "|_| ";
                        break;
                    case 9:
                        line1 += " _  ";
                        line2 += "|_| ";
                        line3 += " _| ";
                        break;
                    default:
                        break;
                }
            }
            bufferedWriter.write(line1 + "\n");
            bufferedWriter.write(line2 + "\n");
            bufferedWriter.write(line3 + "\n");
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
