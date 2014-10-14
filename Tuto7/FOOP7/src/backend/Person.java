package backend;

public class Person implements Comparable {

	private String firstName, lastName;
	
	public Person(String f, String l) {
		firstName=f;
		lastName=l;
	}
	
	public Person(Person p) {
		firstName=new String(p.firstName);
		lastName=new String(p.lastName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
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
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return firstName+" "+lastName;
	}
	
	@Override
	protected Person clone() throws CloneNotSupportedException {
		return new Person(new String(firstName), new String(lastName));
	}

	public int compareTo(Person arg0) {
		if(this.firstName!=arg0.firstName)
			return firstName.compareTo(arg0.firstName);
		else
			return lastName.compareTo(arg0.lastName);
		}

	@Override
	public int compareTo(Object o) throws IllegalArgumentException {
		if (o instanceof Person)
			return this.compareTo((Person)o);
		else
			throw new IllegalArgumentException();		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
