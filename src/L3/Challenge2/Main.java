package L3.Challenge2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OFArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OFArr = Arrays.copyOf(arr, arr.length);


        displaySorted(new BubbleSort(), copy01OFArr);
        displaySorted(new MergeSort(), copy02OFArr);
    }


    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {

        strategy.sort(arr);
      for(int i=0;i<arr.length;i++)
      {
          System.out.println(arr[i]);
      }
        System.out.println("");
    }
}
