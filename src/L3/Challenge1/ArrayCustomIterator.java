package L3.Challenge1;

public class ArrayCustomIterator {

    private int[] arr;
    private int poz;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        poz = 0;
    }

    public boolean hasNext() {

        if (poz == arr.length) {
            return false;
        }
        return true;

    }

    public int next() {

        int nr = arr[poz];
        poz++;

        return nr;
    }


}
