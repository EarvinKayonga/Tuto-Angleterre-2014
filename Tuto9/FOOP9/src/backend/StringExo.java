package backend;

public class StringExo {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("obdurate"), s2 = new StringBuilder("reminisce");
		//obdurate
		//obliteration
		//remplace "e" par "ion" puis "du" par "lite"
		
		s1.replace(7, 8, "ion");
		s1.replace(2, 4, "lite");

		//reminisce
		//romanesque
		//remplace "e" par "o" puis "i" par "a" puis "i" par "e" puis "c" par "qu"
		
		s2.replace(1, 2, "o");
		s2.replace(3, 4, "a");
		s2.replace(5, 6, "e");
		s2.replace(7, 8, "qu");
		
		System.out.println(s1+" "+s2);
	}
}
