package L1;

public class Challenge3 {

    public static void main(String[] args) {

        int[] array1 = {3, 2, -3, -2, 3, 0};
        int[] array2 = {1, 1, 0, -1, -1};
        int[] array3 = {5, 9, -5, 7, -5};

        print(array1);
        print(array2);
        print(array3);
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length-1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i]);
            }

        }
        System.out.println("] => " + getPair(array));
    }


    public static int getPair(int[] array) {
        int pair = 0;

        int[] y = new int[array.length];


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 0 && y[i] == 0 && y[j] == 0) {
                    pair++;
                    y[i] = 1;
                    y[j] = 1;
                }
            }
        }


        return pair;
    }


}
