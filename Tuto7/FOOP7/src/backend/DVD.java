package backend;

public class DVD implements Comparable {

	private String title;
	private Person leadActor;
	private int nbofStars;
	
	public DVD(String t, Person l, int n) {
		title=t;
		leadActor=l;
		nbofStars=n;
	}
	
	public DVD(DVD d) {
		title=new String(d.title);
		leadActor=new Person(d.leadActor);
		nbofStars=d.nbofStars;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((leadActor == null) ? 0 : leadActor.hashCode());
		result = prime * result + nbofStars;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DVD other = (DVD) obj;
		if (leadActor == null) {
			if (other.leadActor != null)
				return false;
		} else if (!leadActor.equals(other.leadActor))
			return false;
		if (nbofStars != other.nbofStars)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Person getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(Person leadActor) {
		this.leadActor = leadActor;
	}

	public int getNbofStars() {
		return nbofStars;
	}

	public void setNbofStars(int nbofStars) {
		this.nbofStars = nbofStars;
	}

	@Override
	public String toString() {
		String res = title+" w/ "+leadActor+" ";
		for (int i=0; i<nbofStars; i++) {
			res+="*";
		}
		return res;
	}

	public int compareTo(DVD o) {
		if (this.title!=o.title)
			return this.title.compareTo(o.title);
		else
			if (!this.leadActor.equals(o.leadActor))
				return this.leadActor.compareTo(o.leadActor);
			else
				return this.nbofStars-o.nbofStars;
	}
	
	@Override
	public int compareTo(Object arg0) throws IllegalArgumentException {
		if (arg0 instanceof DVD)
			return compareTo((DVD)arg0);
		else
			throw new IllegalArgumentException();
	}
	
	@Override
	protected DVD clone() throws CloneNotSupportedException {
		return new DVD(new String(title), new Person(leadActor), nbofStars);
	}
}
