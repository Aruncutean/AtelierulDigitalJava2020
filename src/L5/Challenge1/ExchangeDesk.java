package L5.Challenge1;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {
    public <A extends Currency, B extends Currency> B exchange(A from, Class<B> to, float rate) {
        B toReturn=null;
        try {
            toReturn = to.getDeclaredConstructor().newInstance();
            toReturn.setValue(from.getValue() * rate);
        } catch (Exception e) {
            System.out.println(e);
        }

        return toReturn;
    }

}
