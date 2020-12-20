package L5.Challenge3;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> implements IGenericList<T> {
    private T[] list;

    public GenericList(T rootValue) {
        list = (T[]) new Object[]{rootValue};
    }


    @Override
    public void insert(T element) {

        T[] list1 = (T[]) new Object[list.length + 1];
        for (int i = 0; i < list1.length; i++) {
            if (i == list1.length - 1) {
                list1[i] = element;
            } else {
                list1[i] = list[i];
            }
        }

        list = list1;
    }

    @Override
    public void println() {

        for(int i=0;i< list.length;i++)
        {
            System.out.print(list[i]+", ");
        }
        System.out.println();
    }
}
