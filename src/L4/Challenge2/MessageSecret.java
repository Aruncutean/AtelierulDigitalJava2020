package L4.Challenge2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MessageSecret {

    private String message;

    public MessageSecret(String File)
    {
        message=new String();
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(File)));
            String c;
            while (scanner.hasNext())
            {
                c=scanner.next();
                for(int i=0;i<c.length();i++)
                {
                    if(Character.isUpperCase(c.charAt(i)))
                    {
                        if (c.charAt(i)=='X')
                        {
                            message+=" ";
                        }else
                        {
                            message+=c.charAt(i);
                        }
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getMessage() {
        return message;
    }
}
