package L3.Challenge3;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {

    private List<Apartment> apartments;

    public void represent(Apartment apartment) {

        if (apartments == null) {
            apartments = new ArrayList<>();
        }

        apartments.add(apartment);
    }

    public Apartment rent(Student student) {
        Apartment apartment = null;

        if(student.getName().charAt(0)=='P')
        {
            return apartment;
        }
        int money=student.getMoney();
        for (int i = 0; i < apartments.size(); i++) {
         if(apartments.get(i).getMonthlyRentCost()<money)
         {
             money=apartments.get(i).getMonthlyRentCost();
             apartment=apartments.get(i);
         }

        }

        apartments.remove(apartment);
        return apartment;
    }


}
