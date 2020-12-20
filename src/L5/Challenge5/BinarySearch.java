package L5.Challenge5;

public class BinarySearch<T> {

    private T[] arr;
    private IsSort isSort;

    BinarySearch() {
        isSort = new IsSort();
    }

    public T array(T[] arr, int element) throws ArrayNotSortedException {
        if (isSort.isSort(arr)) {
            throw new ArrayNotSortedException();
        }
        binarySearch(arr, 0, arr.length - 1, element);

        return arr[1];
    }

    int binarySearch(T arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if ((int) arr[mid] == x)
                return mid;

            if ((int) arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);


            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }


}
