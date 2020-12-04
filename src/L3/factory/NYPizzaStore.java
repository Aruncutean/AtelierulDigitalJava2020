package L3.factory;

public class NYPizzaStore extends PizzaSore {


    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("NYMargherita")) {
            return new NYMargherita();
        }
        if (type.equals("NYQuatro")) {
            return new NYQuatro();
        }
        return pizza;
    }
}
