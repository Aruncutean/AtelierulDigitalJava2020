package L3.factory;

public class Main {
    public static void main(String[] args) {
          PizzaSore chPizzaSore=new ChicagoPizzaStore();
        PizzaSore nyPizzaSore=new NYPizzaStore();

        Pizza p1=chPizzaSore.orderPizza("CHMargherita");
        Pizza p2=nyPizzaSore.orderPizza("NYMargherita");

        System.out.println(p1);
        System.out.println(p2);
    }
}
