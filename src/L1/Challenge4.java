package L1;

public class Challenge4 {
    public static void main(String[] args) {

        int[] array1 = {-1, -1, -1, 2};
        int[] array2 = {-1, -2, -1, -2,-1};
        int[] array3 = {-1, -1, -2, 2};
        print(array1);
        print(array2);
        print(array3);


    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
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
                for (int s = j + 1; s < array.length; s++) {
                    if (array[i] + array[j] + array[s] == 0 && y[i] == 0 && y[j] == 0 && y[s] == 0) {
                        pair++;
                        y[i] = 1;
                        y[j] = 1;
                        y[s] = 1;
                        break;
                    }
                }
            }
        }


        return pair;
    }
}
