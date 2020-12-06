package L3.Challenge5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy010fArr= Arrays.copyOf(arr,arr.length);
        Integer[] copy020fArr= Arrays.copyOf(arr,arr.length);


        AscBubbleSort asc=new AscBubbleSort();
        asc.sort(copy010fArr);
        DescBubbleSort desc=new DescBubbleSort();
        desc.sort(copy020fArr);

        displaySort(copy010fArr);
        displaySort(copy020fArr);

    }

    public static void displaySort(Integer[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
