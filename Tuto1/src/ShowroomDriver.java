
import java.util.ArrayList;

/*
 * Ne pas oublier de faire l'UML
 */

/**
 *
 * @author charly
 */
public class ShowroomDriver {

    public static void main(String[] args) {
        Showroom sr = new Showroom();
        Vehicle v1 = new Vehicle("Volkswagen", "Polo", "2714VB62", "2012-06-12", 'd', 3400.00f),
                v2 = new Vehicle("Ford", "Focus", "7654FDS2", "2011-05-02", 'a', 7200.00f),
                v3 = new Vehicle("Renault", "Clio", "236KF32", "1999-04-24" ,'b', 1200.00f),
                v4 = new Vehicle("Fiat", "Panda", "5432PLT5", "2005-12-12", 'e', 4300.00f);
        sr.addVehicle(v1);sr.addVehicle(v2);sr.addVehicle(v3);sr.addVehicle(v4);
        System.out.println(sr);
        
        sr.buyVehicule(sr.getCurrent(), "Charly Mathieu");
        sr.buyVehicule(sr.getCurrent(), "Benjamin Levy");
        
        System.out.println(sr);
    }
}
