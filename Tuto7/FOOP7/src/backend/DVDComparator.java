package backend;

import java.util.Comparator;

public class DVDComparator implements Comparator<DVD> {

	@Override
	public int compare(DVD d1, DVD d2) {
		if (d2.getNbofStars()-d1.getNbofStars()!=0)
			return d2.getNbofStars()-d1.getNbofStars();
		else
			if (d2.getLeadActor().equals(d1.getLeadActor()))
				return d2.getTitle().compareTo(d1.getTitle());
			else
				return d2.getLeadActor().compareTo(d1.getLeadActor());
	}

}
