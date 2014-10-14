package backend;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class DVDCollectionTest {

	private ArrayList<DVD> theDVDs;
	private Person p1, p2, p3, p4;
	
	public DVDCollectionTest() {
		theDVDs = new ArrayList<DVD>();
		p1 = new Person("Leonardo", "DiCaprio");
		p2 = new Person("Fay","Wray");
		p3 = new Person("Naomi", "Watts");
		p4 = new Person("Cary", "Grant");
		
		theDVDs.add(new DVD("Inception", p1, 5));
		theDVDs.add(new DVD("King Kong", p2, 5));
		theDVDs.add(new DVD("King Kong", p3, 4));
		theDVDs.add(new DVD("Indiscreet", p4, 3));
		theDVDs.add(new DVD("Ellie Parker", p3, 4));
	}
	
	private void displayDvds() {
		for (DVD d : theDVDs) {
			System.out.println(d);
		}
	}
	@Test
	public void test() {
		displayDvds();		
		Collections.sort(theDVDs);
		displayDvds();
		Collections.shuffle(theDVDs);
		displayDvds();
		Collections.shuffle(theDVDs);
		displayDvds();
	}

}
