package L6.Challlenge2;

import java.util.*;

public class Main {

    private static Map<Integer, List<Integer>> triangle;

    static Integer bCoeff(Integer line, Integer k) {

        Integer r = 1;
        if (k > line - k) {
            k = line - k;
        }
        for (int i = 0; i < k; ++i) {
            r *= (line - i);
            r /= (i + 1);
        }

        return r;
    }


    public static void main(String[] args) {
        int n = 7;
        triangle = new HashMap<>();

        for (Integer i = 0; i < n; i++) {


            List<Integer> list = new ArrayList<>();

           for(Integer j=0;j<=i;j++){

                list.add(bCoeff(i, j));

            }
            triangle.put(i, list);

        }

        for (List<Integer> li : triangle.values()) {

            for (int i = 0; i < li.size(); i++) {
                System.out.print(li.get(i) + " ");
            }
            System.out.println();
        }

    }
}
     