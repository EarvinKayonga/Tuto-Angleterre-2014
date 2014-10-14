
import java.util.ArrayList;

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
        
    }
    
    public void buyVehicule(Vehicle c, String cust) {
        boolean change=false;
        if (c==vehicles.get(icurrent))
            change=true;
        c.buy(cust, "2014-04-08");
        vehicles.remove(c);
        if (change)
            changeCurrent();
    }
    
    public Vehicle getCurrent() {
        return vehicles.get(icurrent);
    }
    
    public void changeCurrent() {
        if (icurrent!=-1)
            icurrent = (icurrent+1)%vehicles.size();
    }
    
    public String toString() {
        String res="";
        for (Vehicle v : vehicles) {
            res+=v.toString()+"\n";
        }
        return res;
    }
}
