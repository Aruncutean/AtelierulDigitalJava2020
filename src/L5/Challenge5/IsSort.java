package L5.Challenge5;

public class IsSort<T> {

    IsSort() {

    }

    public boolean isSort(T[] arr) {
        boolean b = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((int) arr[i] < (int) arr[i++]) {
                b = false;
            }
        }
        if (b == false) {
            for (int i = 0; i < arr.length; i++) {
                if ((int) arr[i] > (int) arr[i++]) {
                    b = false;
                }

            }
        }
        return b;
    }


}
