package Backend;


import java.util.ArrayList;
import java.util.Date;

/*
 * Ne pas oublier de faire l'UML
 */

/**
 *
 * @author charly
 */
public class Showroom {

    private ArrayList<Vehicle> vehicles;
    private int icurrent;
    private final int MAX_VEHICLES=4;
    
    public Showroom() {
        vehicles = new ArrayList<Vehicle>();
        icurrent=-1;
    }

    public void addVehicle(Vehicle c) {
        if (!c.isSold() && vehicles.size()<MAX_VEHICLES) {
            vehicles.add(icurrent+1, c);
        }
        if (icurrent==-1)
            icurrent=0;
    }
    
    public void buyVehicule(Vehicle c, Customer cust) {
        c.buy(cust, new Date());
        if (c==vehicles.get(icurrent))
            changeCurrent();
    }
    
    public Vehicle getCurrent() {
        return vehicles.get(icurrent);
    }
    public int getIcurrent() {
        return icurrent;
    }
    
    public void changeCurrent() {
        if (icurrent!=-1) {
            int cpt=0;
            while (vehicles.get(icurrent).isSold() && cpt<MAX_VEHICLES) {
                icurrent = (icurrent+1)%vehicles.size();
                cpt++;
            }
            if (cpt==MAX_VEHICLES) {
                icurrent=-1;
            }
        }
    }
    
    @Override
    public String toString() {
        String res="";
        for (Vehicle v : vehicles) {
            res+=v.toString()+"\n";
        }
        return res;
    }
}
