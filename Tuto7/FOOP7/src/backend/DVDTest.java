package backend;

import static org.junit.Assert.*;

import org.junit.Test;

public class DVDTest {

	@Test
	public void testEqualsObject() {
		assertEquals(new DVD("TRUC", new Person("TR", "UC"), 5), new DVD("TRUC", new Person("TR", "UC"), 5));
		assertNotEquals(new DVD("TRUC", new Person("TR", "UC"), 5), new DVD("TRUC", new Person("TR", "UC"), 4));
		assertEquals(new DVD("TRUC", new Person("TR", "UC"), 5), new DVD("TRUC", new Person("R", "UC"), 5));
		assertEquals(new DVD("TRUC", new Person("TR", "UC"), 5), new DVD("TC", new Person("TR", "UC"), 5));
	}

	@Test
	public void testToString() {
		DVD d1=new DVD("Inception", new Person("Leonardo", "Di Caprio"), 5);
		assertEquals(d1.toString(), "Inception w/ Leonardo Di Caprio *****");
	}

	@Test
	public void testCompareToDVD() {
		fail("Not yet implemented");
	}

}
