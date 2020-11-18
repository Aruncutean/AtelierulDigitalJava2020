package L1;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println("Stage 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " => " + compute(i));
        }
        System.out.println(13 + " => " + compute(13));
        System.out.println(15 + " => " + compute(15));
        System.out.println(21 + " => " + compute(21));
        System.out.println(33 + " => " + compute(33));
        System.out.println(51 + " => " + compute(51));
        System.out.println(53 + " => " + compute(53));
        System.out.println();
        System.out.println("Stage 2");
        System.out.println(101 + " => " + compute2(101));
        System.out.println(303 + " => " + compute2(303));
        System.out.println(105 + " => " + compute2(105));
        System.out.println(10101 + " => " + compute2(10101));
        System.out.println(202 + " => " + compute2(202));
    }

    public static String compute(int nr) {
        String message = new String();


        if (nr % 3 == 0) {

            message = message + "Foo";
        }
        if (nr % 5 == 0) {

            message = message + "Bar";
        }
        if (nr % 7 == 0) {
            message = message + "Qix";
        }
        String messageDigit = new String();
        int copyNr = nr;
        while (copyNr != 0) {
            if (copyNr % 10 == 3) {
                messageDigit = "Foo" + messageDigit;
            }
            if (copyNr % 10 == 5) {
                messageDigit = "Bar" + messageDigit;
            }
            if (copyNr % 10 == 7) {
                messageDigit = "Qix" + messageDigit;
            }

            copyNr = copyNr / 10;
        }
        message = message + messageDigit;
        if (nr % 3 != 0 && nr % 5 != 0 && nr % 7 != 0 && messageDigit.isEmpty()) {
            message = Integer.toString(nr);
        }

        return message;
    }

    public static String compute2(int nr) {
        String message = new String();
        boolean isDivisible = true;

        if (nr % 3 == 0) {

            message = message + "Foo";
            isDivisible = false;
        }
        if (nr % 5 == 0) {

            message = message + "Bar";
            isDivisible = false;
        }
        if (nr % 7 == 0) {
            message = message + "Qix";
            isDivisible = false;
        }
        String messageDigit = new String();
        int copyNr = nr;
        while (copyNr != 0) {
            if (copyNr % 10 == 3) {
                messageDigit = "Foo" + messageDigit;
            }
            if (copyNr % 10 == 5) {
                messageDigit = "Bar" + messageDigit;
            }
            if (copyNr % 10 == 7) {
                messageDigit = "Qix" + messageDigit;
            }
            if (copyNr % 10 == 0 ) {
                messageDigit = "*" + messageDigit;
            }
            if(isDivisible==true && copyNr%10!=0)
            {
                messageDigit=Integer.toString(copyNr%10)+messageDigit;
            }
            copyNr = copyNr / 10;
        }
        message = message + messageDigit;


        return message;
    }


}
