package L5.Challenge4;

public class Main {

    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,2,3};
        ArrayIterator<Integer> it=new ArrayIterator<>(arr);

        it.insert(4);

        while (it.hasNext())
        {
            System.out.println(it.next());
        }




    }
}
