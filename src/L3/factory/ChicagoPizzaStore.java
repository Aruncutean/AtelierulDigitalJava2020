package L3.factory;

public class ChicagoPizzaStore extends PizzaSore{


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("CHMargherita")) {
            return new CHMargherita();
        }
        if (type.equals("CHQuatro")) {
            return new CHQuatro();
        }
        return pizza;
    }
}
