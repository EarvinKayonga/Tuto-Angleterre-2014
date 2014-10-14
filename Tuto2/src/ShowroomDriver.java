
import java.util.Date;



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
        Vehicle v1 = new Vehicle("Volkswagen", "Polo", "2714VB62", new Date("12 Jun 2012"), 'd', 3400.00f),
                v2 = new Vehicle("Ford", "Focus", "7654FDS2", new Date("2 May 2011"), 'a', 7200.00f),
                v3 = new Vehicle("Renault", "Clio", "236KF32", new Date("24 Apr 1999"),'b', 1200.00f),
                v4 = new Vehicle("Fiat", "Panda", "5432PLT5", new Date("12 Dec 2005"), 'e', 4300.00f);
        sr.addVehicle(v1);sr.addVehicle(v2);sr.addVehicle(v3);sr.addVehicle(v4);
        System.out.println(sr);
        System.out.println(v1.getSellDate());
        System.out.println(v2.getSellDate());
        
        sr.buyVehicule(sr.getCurrent(), new Customer("Charly Mathieu", "Quelque part"));
        sr.buyVehicule(sr.getCurrent(), new Customer("Benjamin Levy", "Autre part"));
        
        System.out.println(sr);
    }
}
