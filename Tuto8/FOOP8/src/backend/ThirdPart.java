package backend;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class ThirdPart {

	public static void main(String[] args) {
		TreeMap<Date, String> tab = new TreeMap<Date, String>();
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.LONG);
		try {
			tab.put(dateformat.parse("20 Janvier 2012"), "appointment1");
			tab.put(dateformat.parse("28 Février 2012"), "appointment2");
			tab.put(dateformat.parse("15 Février 2012"), "appointment3");
			tab.put(dateformat.parse("26 Février 2012"), "appointment4");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		NavigableMap<Date, String> tmp=null;

		try {
			tmp = tab.subMap(dateformat.parse("1 Janvier 2012"), true,
					dateformat.parse("31 Janvier 2012"),true);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("First appointment : "+ tmp.get(tmp.firstKey()));
		
		try {
			tmp = tab.subMap(dateformat.parse("1 Février 2012"), true,
					dateformat.parse("28 Février 2012"),true);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		for (Date d : tmp.navigableKeySet()) {
			System.out.println(tmp.get(d));
		}
		
		System.out.println("---");
		
		try {
			tab.put(dateformat.parse("20 Février 2012"), "appointment8");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		try {
			tmp = tab.subMap(dateformat.parse("1 Février 2012"), true,
					dateformat.parse("28 Février 2012"),true);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		for (Date d : tmp.navigableKeySet()) {
			System.out.println(tmp.get(d));
		}
	}

}
