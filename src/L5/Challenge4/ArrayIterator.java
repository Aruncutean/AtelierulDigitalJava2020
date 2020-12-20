package L5.Challenge4;

public class ArrayIterator<T> implements IArrayIterator<T>,IGenericList<T> {

    private T[] list;
    private int contor;

    public ArrayIterator(T[] list) {
        this.list = list;
        this.contor = 0;
    }


    @Override
    public boolean hasNext() {
        if (contor == list.length)
            return false;
        return true;
    }

    @Override
    public T next() {
        T element = list[contor];
        contor++;
        return element;
    }


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


    public void println() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println();
    }
}
